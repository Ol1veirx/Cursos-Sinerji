<?php

declare(strict_types=1);

namespace App\Enum;

enum TicketChoice: string {
    Case Hour = 'Hour';
    Case Day = 'day';
    Case Month = 'month';

    public function toString() : string {
        return match($this) {
            self::Hour => 'POr hora',
            self::Day => 'Diaria',
            self::Month => 'Mensalista',
            default => 'Desconhecido'
        };
    }
}