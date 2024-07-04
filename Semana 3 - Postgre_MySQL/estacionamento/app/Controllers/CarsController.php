<?php

namespace App\Controllers;

use App\Models\ConnectorModel;
use CodeIgniter\Controller;

class Cars extends Controller
{
    protected $connectorModel;

    public function __construct()
    {
        $this->connectorModel = new ConnectorModel();
    }

    public function index()
    {
        $cars = $this->connectorModel->findDocuments('cars');
        return view('cars/index', ['cars' => $cars]);
    }

    public function create()
    {
        return view('cars/create');
    }

    public function store()
    {
        $data = [
            'placa' => $this->request->getPost('placa'),
            'descricao' => $this->request->getPost('descricao')
        ];

        $this->connectorModel->insertDocument('cars', $data);
        return redirect()->to('/cars');
    }

    public function show($id)
    {
        $car = $this->connectorModel->findDocuments('cars', ['_id' => new \MongoDB\BSON\ObjectId($id)]);
        return view('cars/show', ['car' => $car[0]]);
    }

    public function edit($id)
    {
        $car = $this->connectorModel->findDocuments('cars', ['_id' => new \MongoDB\BSON\ObjectId($id)]);
        return view('cars/edit', ['car' => $car[0]]);
    }

    public function update($id)
    {
        $data = [
            'placa' => $this->request->getPost('placa'),
            'descricao' => $this->request->getPost('descricao')
        ];

        $this->connectorModel->updateDocument('cars', ['_id' => new \MongoDB\BSON\ObjectId($id)], $data);
        return redirect()->to('/cars');
    }

    public function delete($id)
    {
        $this->connectorModel->deleteDocument('cars', ['_id' => new \MongoDB\BSON\ObjectId($id)]);
        return redirect()->to('/cars');
    }
}
