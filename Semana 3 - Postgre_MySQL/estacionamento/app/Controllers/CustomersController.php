<?php

namespace App\Controllers;

use App\Models\ConnectorModel;
use CodeIgniter\Controller;

class Customers extends Controller
{
    protected $connectorModel;

    public function __construct()
    {
        $this->connectorModel = new ConnectorModel();
    }

    // Método para exibir todos os clientes
    public function index()
    {
        $customers = $this->connectorModel->findDocuments('customers');
        return view('customers/index', ['customers' => $customers]);
    }

    // Método para exibir o formulário de criação de um novo cliente
    public function create()
    {
        return view('customers/create');
    }

    // Método para salvar um novo cliente
    public function store()
    {
        $data = [
            'name' => $this->request->getPost('name'),
            'email' => $this->request->getPost('email'),
            'phone' => $this->request->getPost('phone')
        ];

        $this->connectorModel->insertDocument('customers', $data);
        return redirect()->to('/customers');
    }

    // Método para exibir um cliente específico
    public function show($id)
    {
        $customer = $this->connectorModel->findDocuments('customers', ['_id' => new \MongoDB\BSON\ObjectId($id)]);
        return view('customers/show', ['customer' => $customer[0]]);
    }

    // Método para exibir o formulário de edição de um cliente
    public function edit($id)
    {
        $customer = $this->connectorModel->findDocuments('customers', ['_id' => new \MongoDB\BSON\ObjectId($id)]);
        return view('customers/edit', ['customer' => $customer[0]]);
    }

    // Método para atualizar um cliente
    public function update($id)
    {
        $data = [
            'name' => $this->request->getPost('name'),
            'email' => $this->request->getPost('email'),
            'phone' => $this->request->getPost('phone')
        ];

        $this->connectorModel->updateDocument('customers', ['_id' => new \MongoDB\BSON\ObjectId($id)], $data);
        return redirect()->to('/customers');
    }

    // Método para excluir um cliente
    public function delete($id)
    {
        $this->connectorModel->deleteDocument('customers', ['_id' => new \MongoDB\BSON\ObjectId($id)]);
        return redirect()->to('/customers');
    }
}
