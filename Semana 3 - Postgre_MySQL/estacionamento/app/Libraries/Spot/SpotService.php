<?php

declare(strict_types=1);

namespace App\Libraries\Spot;

use App\Enum\TicketStatus;
use App\Libraries\Mongo\Basic\CategorieModel;
use App\Libraries\Mongo\Basic\TicketModel;
use stdClass;

use function PHPUnit\Framework\stringContains;

class SpotService {

    private const COMMON_BTN_CLASSES = 'btn-style-park btn position-relative fw-bold p-1';

    private const CLASS_BTN_FOR_CREATE_TICKET = 'btn-new-ticket';

    private const CLASS_BTN_FOR_VIEW_TICKET = 'btn-view-ticket';

    private const CLASS_BTN_FOR_OCCUPIED_SPOT = 'small-font-plate btn-dark';
    private const CLASS_BTN_FOR_SPOT_FREE = 'btn-spot-free';

    public function getSpots(): string {
        $category = $this->prepareSpots();

        if(empty($category)){
            return '
                <div class="container">
                    <div class="alert alert-warning text-center">
                        <strong>Não há categorias disponíveis</strong>
                    </div>
                </div>
            ';
        }

        $divCols = '';
        foreach($category as $category) {
            $divCols .= $this->generateCategoryHtml(category: $category);
        }
        
        return '';
    }

    private function generateCategoryHtml(object $category): string {

        return "<div class='col-md grid-margin stretch-card'>
            <div class='card pt-3'>
                <h4 class='text-center card-title'>{$category->name}</h4>
                <ul class='list-inline text-cante pt-2'>
                    {$this->generateLiElementsHtml(category: $category)}
                </ul>
            </div>
        </div>";
    }

    private function generateLiElementsHtml(object $category): string {
        $liElements = '';

        foreach($category->spots as $spot){
            $liElements .= "<li class='list-inline-item m-1'>
                                {$this->generateButtonParkHtml(category: $category, spot: $spot)}
                            </li>";
        }

        return $liElements;
    }

    private function generateButtonParkHtml(object $category, int | string | object $spot): string {
        if(is_object(($spot))){
            return $this->generateOccupiedSpotButtonHtml(spot: $spot);
        }
        return $this->generateFreeSpotButtonHtml(category: $category, spot: $spot);
    }

    private function generateOccupiedSpotButtonHtml(object $spot): string{

        $class = '';
        $class .= self::COMMON_BTN_CLASSES;
        $class .= " "; // Concatenado com espaço
        $class .= self::CLASS_BTN_FOR_OCCUPIED_SPOT;
        $class .= " "; // Concatenado com espaço
        $class .= self::CLASS_BTN_FOR_VIEW_TICKET;
        return form_button([
            'type' => 'button',
            'class' => $class,
            'title' => $spot->vehicle,
            'data-code' => (string) $spot->ticket_code,
            'content' => "{$spot->plate} {$spot->type}",
        ]);
    }

    private function generateFreeSpotButtonHtml(object $category, int | string | object $spot): string{
        $class = '';
        $class .= self::COMMON_BTN_CLASSES;
        $class .= " "; // Concatenado com espaço
        $class .= self::CLASS_BTN_FOR_SPOT_FREE;
        $class .= " "; // Concatenado com espaço
        $class .= self::CLASS_BTN_FOR_CREATE_TICKET;

        return form_button([
            'type' => 'button',
            'class' => $class,
            'title' => 'Vaga livre',
            'data-code' => (string) $category->code,
            'content' => $spot, //O quer sera exibido
        ]);
    }

    private function prepareSpots(): array {
        // Busca as categorias no BD
        $categories = (new CategorieModel)->all();

        if(empty($categories)){
            return [];
        }

        // Recuperar os tickets abertos
        /**
         * 
         */
        $ticketModel = new TicketModel();
        $openTickets = $ticketModel->getAll(
            filter: ['status' => TicketStatus::Open->value],
        );

        $categoriesPrepared = [];

        foreach($categories as $category){
            $categoriesPrepared[] = $this->prepareCategory(category: $category, openTickets: $openTickets);
        }

        return $categoriesPrepared;
    }

    private function prepareCategory(object $category, array $openTickets): object {

        $spotsCategory = [];

        for($spot = 1; $spot <= $category->spots; $spot++){
            $spotsCategory[$spot] = $spot;
            $this->addTicketDataToSpot(spotsCategory: $spotsCategory, spot: $spot, category: $category, openTickets: $openTickets);

        }

        return (object) [
            'code' => (string) $category->_id,
            'name' => (string) $category->name,
            'spots' => (string) $spotsCategory,
        ];
    }

    private function addTicketDataToSpot(array &$spotsCategory,int $spot, object $category,array $openTickets): void{
        // Percorrer os tickets em aberto
        foreach($openTickets as $ticket){
            // converter os ids para os tipos certos
            $categoryId = (string) $category->_id;
            $ticketCategory = (string) $ticket->$category->_id;
            $ticketSpot = (int) $ticket->spot;

            // Verificar se a categoria e a vaga correspondem a um ticket
            if($categoryId === $ticketCategory && $spot === $ticketSpot){
                // Adiciono informações do ticket a vaga
                $spotsCategory[$spot] = (object)[
                    'plate' => $ticket->plate,
                    'ticket_code' => (string)$ticket->_id,
                    'vehicle' => $ticket->vehicle,
                    'type' => empty($ticket->customer) ? 'Avulso' : 'Mensalista',
                ];
            }

        }
    }

}