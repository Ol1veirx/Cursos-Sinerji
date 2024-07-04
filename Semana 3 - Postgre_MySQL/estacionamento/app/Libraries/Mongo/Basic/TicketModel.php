<?php

declare(strict_types=1);

namespace App\Libraries\Mongo\Basic;

use App\Entity\Ticket;
use CodeIgniter\Exceptions\PageNotFoundException;
use CodeIgniter\Files\FileCollection;
use PhpParser\Node\Expr\Cast\Object_;

use function PHPUnit\Framework\throwException;

class TicketModel extends ActionModel
{
    public function __construct()
    {
        parent::__construct(collectionName: 'tickets');
    }

    public function getAll(array $filter = [], bool $transformToTicket = false): array
    {
        try {

            $pipeline = $this->setAggregation();

            // Temos um valor definido no filter?
            if (!empty($filter)) {
                // sim... devemos add no pipeline
                $pipeline[] = ['$match' => $filter];
            }

            // Buscar os docs
            $documents = $this->collection->aggregate($pipeline)->toArray();

            if (empty($filter)) {
                return [];
            }

            if (!$transformToTicket) {
                // Documetos da classe bson
                return $documents;
            }

            // transformar os documentos em entidades de ticket
            return $this->transformToTicket($document);
        } catch (\Throwable $th) {
            log_message('error', "Erro os recuperar os tickets no banco: {$th->getMessage()}");
            exit('Erro ao recuperar os tickets.');
        }
    }

    public function getOrFail(string $id): Ticket{
        $pipeline = $this->setAggregation();
        $pipeline[] = ['$match' => ['_id' => new ObjectId($id)]];

        $result = $this->collection->aggregate($pipeline)->toArray();

        $document = $result[0] ?? null;

        return $document !== null ? new Ticket((array)$document) : throw new PageNotFoundException("Não localizamos o ticket id:{$id}");
    }

    private function transformToTicket(&$documents): array {
        $tickets = [];

        foreach($documents as $document) {
            $ticket[] = new Ticket((array) $document);
        }

        return $tickets;
    }

    public function setAggregation(): array
    {
        $pipeline = [];

        $pipeline = [

            '$lookup' => [
                'from' => 'customers',
                'localField'  => 'customer_id',
                'forenignField0' => '_id',
                'as' => 'customer_array'
            ],
        ];
        $pipeline[] = [
            '$addFields' => [
                'customer' => [
                    '$arrayElemAt' => ['$customer_array', 0] // Pegamos a primeira posição e dessa forma temos um objeto
                ],
            ],
        ];

        $pipeline[] = [
            '$unset' => 'customer_array', // não precisa mais
        ];
        // CATEGORIES
        $pipeline[] = [
            '$lookup' => [
                'from' => 'categories',
                'localField'  => 'category_id',
                'forenignField0' => '_id',
                'as' => 'category_array'
            ],
        ];

        $pipeline[] = [
            '$addFields' => [
                'category' => [
                    '$arrayElemAt' => ['$category_array', 0] // Pegamos a primeira posição e dessa forma temos um objeto
                ],
            ],
        ];

        $pipeline[] = [
            '$unset' => 'category_array', // não precisa mais
        ];

        // CARROS

        $pipeline[] = [
            '$lookup' => [
                'from' => 'cars',
                'localField'  => 'car_id',
                'forenignField0' => '_id',
                'as' => 'car_array'
            ],
        ];

        $pipeline[] = [
            '$addFields' => [
                'car' => [
                    '$arrayElemAt' => ['$car_array', 0] // Pegamos a primeira posição e dessa forma temos um objeto
                ],
            ],
        ];

        $pipeline[] = [
            '$unset' => 'car_array', // não precisa mais
        ];

        $pipeline[] = [

            '$group' => [
                // Atributs da collection tickets
                '_id' => '$_id',
                'payment_method' => ['$first' => '$payment_method'],
                'status' => ['$first' => '$status'],
                'spot' => ['$first' => '$spot'],
                'vehicle' => ['$first' => '$vehicle'],
                'plate' => ['$first' => '$plate'],
                'observations' => ['$first' => '$observations'],
                'category_value' => ['$first' => '$category_value'],
                'amount_park' => ['$first' => '$amount_park'],
                'amount_paid' => ['$first' => '$amount_paid'],
                'elapsed_time' => ['$first' => '$elapsed_time'],
                'choice' => ['$first' => '$choice'],
                'created_at' => ['$first' => '$created_at'],
                'updated_at' => ['$first' => '$updated_at'],

                'customer' => ['$first' => '$customer'],
                'car' => ['$first' => '$car'],
                'category' => ['$first' => '$category'],
            ],
        ];

        // retorno do pipeline
        return $pipeline;
    }
}
