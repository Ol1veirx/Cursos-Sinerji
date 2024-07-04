<?php

declare(strict_types=1);

namespace App\Libraries\Ticket;

use App\Entity\Ticket;
use stdClass;

class TicketCalculationService {
    private Ticket $ticket;

    public function calculate(Ticket $ticket): Ticket {
        $this->ticket = $ticket;

        $this->setCurrentSituation();
        
        return $this->ticket;
    }

    private function setCurrentSituation(): void {
        $this->ticket->elapsed_time->$this->elapsedTime();
        $this->ticket->amount_park = $this->calculateAmountPark();
        $this->ticket->amount_due = $this->calculateAmountDue();

        $this->ticket->category_value = $this->ticket->amount_due > 0 ? $this->getCategoryValue() : 0;

    }

    public function elapsedTime(): string {
        return '';
    }

    public function calculateAmountPark(): float {
        return 1.1;
    }

    private function calculateElapsedTime(): object {
        return new stdClass;
    }

    private function getCategoryValue() : int {
        return 0;
    }

    private function calculateAmountDue(): float {
        return 0.0;
    }
}