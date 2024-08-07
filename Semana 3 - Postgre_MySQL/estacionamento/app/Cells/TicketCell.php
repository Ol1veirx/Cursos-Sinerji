<?php

namespace App\Cells;

use App\Entity\Ticket;
use CodeIgniter\View\Cells\Cell;

class ShowTicketCell extends Cell{
    protected Ticket $ticket;

    public function getTicketProperty(): Ticket{
        return $this->ticket;
    }
}