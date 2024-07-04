<?php

namespace App\Validation;

class SingleTicketValidation
{
    public function getRules(): array{
        return [
            'spot' => [
                'label' => 'Vaga',
                'rules' => 'required',
                'errors' => [
                    'required' => 'Obrigatorio'
                ]
            ],
    
            'category_id' => [
                'label' => 'Categoria',
                'rules' => 'required',
                'errors' => [
                    'required' => 'Obrigatorio',
                ]
                ],
            'choice' => [
                'label' => 'Desrição do veiculo',
                'rules' => 'required',
                'errors' => [
                    'required' => 'Obrigatorio'
                ]
                ],
            'Vehicle' => [
                'label' => 'Descrição do veiculo',
                'rules' => 'required',
                'errors' => [
                    'required' => 'Obrigatorio'
                ]
            ]
                ];
    }
    
}
