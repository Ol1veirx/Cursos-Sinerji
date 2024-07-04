<?php

namespace App\Controllers;

use App\Libraries\Mongo\Basic\CategorieModel;
use App\Libraries\Mongo\Basic\TicketModel;
use App\Libraries\Spot\SpotService;
use App\Models\CompanyModel;
use App\Validation\CompanyValidation;
use CodeIgniter\HTTP\RedirectResponse;

class ParkingController extends BaseController
{

    private const VIEWS_DIRECTORY = 'Parking/';
    private SpotService $spotService;

    public function __construct()
    {
        $this->spotService = new SpotService();
    }

    public function index(): string
    {
        $model = new TicketModel();

        $this->dataToView['title'] = 'Disposição das vagas';
        $this->dataToView['spots'] = $this->spotService->getSpots();

        return view(self::VIEWS_DIRECTORY . 'index', $this->dataToView);
    } 

    public function show(): string {
        $ticketId = (string) $this->request->getGet('ticket_id');

        $ticket = (new TicketModel())->getOrFail($ticketId);

        /**
         * @todo
         */

        $this->dataToView['title'] = 'Disposição das vagas';
        $this->dataToView['spots'] = $ticket;

        return view(self::VIEWS_DIRECTORY . 'index', $this->dataToView);
    }
}