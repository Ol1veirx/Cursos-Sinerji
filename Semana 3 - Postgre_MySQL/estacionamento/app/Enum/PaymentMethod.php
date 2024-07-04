<?php

declare(strict_types=1);

namespace App\Enum;

enum PaymentMethod: string {
    Case CreditCard = 'credit_card';
    Case DebitCard = 'debit_card';
    Case Pix = 'pix';
    Case Money = 'money';
    Case Free = 'free';

    public function toString() : string {
        return match($this) {
            self::CreditCard => 'cartao de credito',
            self::DebitCard => 'cartao de debito',
            self::Pix => 'PIX',
            self::Money => 'dinheiro',
            self::Free => 'sem custo',
            default => 'Desconhecido'
        };
    }
}