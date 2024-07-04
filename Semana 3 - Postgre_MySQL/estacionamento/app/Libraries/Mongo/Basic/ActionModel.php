<?php
declare(strict_types=1);

namespace App\Libraries\Mongo\Basic;

abstract class ActionModel extends ConnectorModel {
    public function __construct(string $collectionName) 
    {
        parent::__construct(collectionName: $collectionName);
    }

    // Metodo responsavel por inserir os dados no banco 
    public function create(array $data): bool {
        try {
            $data = esc($data);

            $result = $this->collection->insertOnde($data);

            return $result->getInsertedCount() == 1;
        } catch (\Throwable $th) {
            log_message('error', "Erro os inserir o registro Mongo DB: {$th->getMessage()}");
            exit('Erro ao inserir o registro no mongo DB.');
        }
    }

    public function all(): array {
        try {
            $cursor = $this->collection->find([]);;
            $documents = $cursor->toArray();

            return $documents;
        } catch (\Throwable $th) {
            log_message('error', "Erro ao recuperar os dados no mongo DB {$th->getMessage()}");
            exit('Erro ao inserir o registro no mongo DB.');
        }
    }
}