<?php

namespace App\Controllers;

use App\Libraries\Mongo\Basic\CategorieModel;
use CodeIgniter\HTTP\RedirectResponse;

class CategoriesController extends BaseController
{
    private const VIEWS_DIRECTORY = 'Categories/';
    
    private CategorieModel $categoryModel;

    public function __construct()
    {
        $this->categoryModel = new CategorieModel();
    }

    public function index(): string
    {
        $this->dataToView['title'] = 'Gerenciar Categorias';

        return view(self::VIEWS_DIRECTORY. 'index', $this->dataToView);
    }

    public function create(): RedirectResponse {
        $rules = (new CategorieValidation)->getRules();

        if(!$this->validate($rules)){
            return redirect()
                ->back()
                ->with('danger', 'Verifique os erros e tente novamente')
                ->with('errors', $this->validator->getErrors())
                ->withInput();
        }
        
        $data = $this->prepareData();
        if(! $this->CategorieModel->create($data)){
            return redirect()
                ->back()
                ->with('danger', 'Erro no servidor')
                ->with('errors', $this->validator->getErrors())
                ->withInput();
        }
    }

    private function prepareData(): array {
        $data = esc($this->validator->getValidated());

        return [
            'name' => $data['name'],
            'spots' => intval('spots'),
            'price_day' => intval('price_day'),
            'price_hour' => intval('price_hour'),
        ];
    }
}