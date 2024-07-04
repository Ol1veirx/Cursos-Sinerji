<?php
declare(strict_types=1);

namespace App\Libraries\Mongo\Basic;

use CodeIgniter\Files\FileCollection;

class CategorieModel extends ActionModel{
    public function __construct()
    {
        parent::__construct(collectionName: 'categories');
    }
}