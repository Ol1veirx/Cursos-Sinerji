<?php

namespace App\Models;

use CodeIgniter\Model;
use Faker\Provider\ar_EG\Company;

class CompanyModel extends Model
{
    // Conexa com o postgre baseado no .env
    protected $DBGroup = 'company';

    protected $table = 'information'; // Nome da tabela associada ao modelo
    protected $primaryKey = 'id'; // Chave primária da tabela

    protected $useAutoIncrement = true; // Usar auto incremento na chave primária
    protected $returnType = Company::class; // Retornar os resultados como array
    protected $useSoftDeletes = false; // Se deseja usar soft deletes

    protected $allowedFields = [
        'name',
        'phone' ,
        'address' ,
        'message',
    ]; // Campos permitidos para operações de inserção e atualização em massa

    public function getCompany(): Company {
        return $this->first() ?? new Company();
    }
}
