<?php

namespace App\Entity;

use App\Enum\PaymentMethod;
use App\Enum\TicketChoice;
use App\Enum\TicketStatus;
use CodeIgniter\Entity\Entity;

class Ticket extends Entity {
    protected $date = ['created_at', 'updated_at'];

    public function id() : string {
        return (string) $this->id;
    }

    public function status(): string {
        return TicketStatus::tryFrom($this->status)->toString();
    }

    public function isClosed(): bool {
        return $this->status === TicketStatus::Closed->value;
    }

    public function car() : string {
        if( $this->hasCustomer()) {
            return "{$this->vehicle->plate}";
        }

        return $this?->car?->vehicle . ' / ' . $this?->car?->plate;
    }

    public function category() : string {
        return $this?->category?->name ?? '<span class="badge badge-danger">Não localizado</span>';
    }

    public function type(): string {
        return $this->choice === TicketChoice::Month->value ? 'Mensalista' : 'Avulso';
    }

    public function choice(): string {
        return TicketChoice::tryFrom($this->type)->toString();
    }

    public function paymentMethod(): string {
        if( $this->isClosed()){
            return $this->status();
        }

        return PaymentMethod::tryFrom($this->payment_method)->toString();
    }

    public function hasCustomer(): bool{
        return $this->customer !== null;
    }

    public function observation(): string {
        return $this->observations ?? 'Sem observações';
    }
}