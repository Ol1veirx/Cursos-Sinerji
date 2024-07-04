<?php
declare(strict_types=1);

namespace App\Libraries\Mongo\Basic;

class ConnectorModel extends Model
{
    protected $mongoClient;
    protected $db;

    public function __construct()
    {
        // Chama o construtor da classe pai
        parent::__construct();

        // Defina sua string de conexão MongoDB
        $mongoDBUri = 'mongodb://localhost:27017';  // Substitua pelo seu URI do MongoDB
        $dbName = 'nome_do_seu_banco_de_dados';    // Substitua pelo nome do seu banco de dados

        // Cria uma nova instância do cliente MongoDB
        $this->mongoClient = new Client($mongoDBUri);
        
        // Seleciona o banco de dados
        $this->db = $this->mongoClient->$dbName;
    }

    // Método para obter uma coleção
    public function getCollection($collectionName)
    {
        return $this->db->$collectionName;
    }

    // Exemplo de método para inserir um documento em uma coleção
    public function insertDocument($collectionName, $document)
    {
        $collection = $this->getCollection($collectionName);
        return $collection->insertOne($document);
    }

    // Exemplo de método para buscar documentos em uma coleção
    public function findDocuments($collectionName, $filter = [])
    {
        $collection = $this->getCollection($collectionName);
        return $collection->find($filter)->toArray();
    }
}