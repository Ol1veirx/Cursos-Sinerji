<?php

declare(strict_types=1);

namespace App\Libraries\Ticket;

use App\Enum\TicketStatus;
use App\Libraries\Mongo\Basic\TicketModel;
use CodeIgniter\I18n\Time;

class StoreTicketService {

    private ?array $validatedData;

    private TicketModel $ticketModel;

    public function __construct()
    {
        $this->validatedData = [];

        $this->ticketModel = new TicketModel();
    }

    public function createSingle(array $validatedData): bool{

        $this->validatedData = $validatedData;

        $dataToStore = array_merge(
            $this->getCommonData(),
            $this->getSingleData()
        );

        return $this->ticketModel->create($dataToStore);
    }

    private function getCommonData(): array {


        return [
            'category_id' => new ObjectId($this->validatedData['category_id']),
            'spot' => intval($this->validatedData['spot']),
            'status' => TicketStatus::Open->value,
            'created_at' => Time::now()->format('Y-m-d :i:s'), // 2024-7-4 11:00:00
        ];
    }

    private function getSingleData(): array {
        return [
            'vehicle' => $this->validatedData['vehicle'],
            'plate' => $this->validatedData['plate'],
            'observations' => $this->validatedData['observations'],
            'choice' => $this->validatedData['choice'],
        ];
    }
}