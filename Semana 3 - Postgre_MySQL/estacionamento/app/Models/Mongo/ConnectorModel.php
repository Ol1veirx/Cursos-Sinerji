<?php

namespace App\Models;

use MongoDB\Client;

class ConnectorModel
{
    protected $mongoClient;
    protected $db;

    public function __construct()
    {
        $mongoDBUri = 'mongodb+srv://ldol1:soSrkV0Tq2YPAjiJ@etacionamento.pxob7ql.mongodb.net/?retryWrites=true&w=majority&appName=Etacionamento';
        $dbName = 'etacionamento';     

        $this->mongoClient = new Client($mongoDBUri);
        $this->db = $this->mongoClient->$dbName;
    }

    public function getCollection($collectionName)
    {
        return $this->db->$collectionName;
    }

    public function insertDocument($collectionName, $document)
    {
        $collection = $this->getCollection($collectionName);
        return $collection->insertOne($document);
    }

    public function findDocuments($collectionName, $filter = [])
    {
        $collection = $this->getCollection($collectionName);
        return $collection->find($filter)->toArray();
    }

    public function updateDocument($collectionName, $filter, $update)
    {
        $collection = $this->getCollection($collectionName);
        return $collection->updateOne($filter, ['$set' => $update]);
    }

    public function deleteDocument($collectionName, $filter)
    {
        $collection = $this->getCollection($collectionName);
        return $collection->deleteOne($filter);
    }
}
