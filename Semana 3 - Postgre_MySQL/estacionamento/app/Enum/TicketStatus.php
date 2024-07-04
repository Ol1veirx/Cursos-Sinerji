<?php

declare(strict_types=1);

namespace App\Enum;

enum TicketStatus: string {
    Case Open = 'open';
    Case Closed = 'closed';

    public function toString() : string {
        return match($this) {
            self::Open => 'Aberto',
            self::Closed => 'Encerrado',
            default => 'Desconhecido'
        };
    }
}