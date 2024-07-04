<?php

namespace App\Controllers;

use App\Libraries\Mongo\Basic\CategorieModel;
use App\Models\CompanyModel;
use App\Validation\CompanyValidation;
use CodeIgniter\HTTP\RedirectResponse;

class CategoriesController extends BaseController
{

    private CompanyModel $companyModel;

    public function __construct()
    {
        $this->companyModel = model(CompanyModel::class);
    }

    public function index(): string
    {
        $this->dataToView['title'] = 'Gerenciar Informações da empresa';

        return view('Company/index', $this->dataToView);
    }

    public function process(): RedirectResponse {
        $rules = (new CompanyValidation)->getRules();

        if( ! $this->validate($rules)) {
            return redirect()->back()->with('danger', 'Verifique os erros e tente novamente')
            ->with('errors', $this->validator->getErrors())
            ->withInput();
        }

        $company =  $this->companyModel->getCompany();
        $company->fill($this->validator->getValidated());


        if($company->hasChanged()){
            $this->companyModel->save($company);
        }

        return redirect()->back()->with('success', 'Sucesso');
    }
}