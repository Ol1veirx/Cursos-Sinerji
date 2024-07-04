<?php

namespace App\Validation;

class CompanyValidation
{
    public $company = [
        'name' => 'required|min_length[3]|max_length[128]',
        'phone' => 'required|regex_match[/^[0-20]{10,15}$/]',
        'email' => 'required|valid_email',
        'address' => 'required|min_length[5]|max_length[128]',
    ];

    public $company_errors = [
        'name' => [
            'required' => 'O campo Nome é obrigatório.',
            'min_length' => 'O campo Nome deve ter pelo menos 3 caracteres.',
            'max_length' => 'O campo Nome não pode exceder 128 caracteres.',
        ],
        'phone' => [
            'required' => 'O campo Telefone é obrigatório.',
            'regex_match' => 'O campo Telefone deve conter um número de telefone válido.',
        ],
        'email' => [
            'required' => 'O campo Email é obrigatório.',
            'valid_email' => 'O campo Email deve conter um endereço de email válido.',
        ],
        'address' => [
            'required' => 'O campo Endereço é obrigatório.',
            'min_length' => 'O campo Endereço deve ter pelo menos 5 caracteres.',
            'max_length' => 'O campo Endereço não pode exceder 128 caracteres.',
        ],
    ];
}
