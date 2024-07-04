<?php

use App\Controllers\BaseController;
use App\Libraries\Mongo\Basic\CategorieModel;
use App\Libraries\Ticket\StoreTicketService;
use App\Validation\SingleTicketValidation;
use CodeIgniter\HTTP\RedirectResponse;

class SingleTicketsController extends BaseController {
    private const VIEWS_DIRECTORY = 'Parking/Single/';

    public function new(){
        $categoryId = (string) $this->request->getGet('code');
        $spot = (int) $this->request->getGet('spot');

        if(empty($categoryId) || $spot< 1){
            return redirect()->back()->with('info', 'Não conseguimos identificar a categoria');
        }
        $category = (new CategorieModel)->findOrFail($categoryId);
        $this->dataToView['title'] = 'Criar ticket avulso';
        $this->dataToView['category'] = $category;
        $this->dataToView['hidden'] = ['spot' => $spot, 'category_id' => (string) $category];

        return view(self::VIEWS_DIRECTORY . 'new', $this->dataToView);

    }

    public function create(): RedirectResponse {
        $rules = (new SingleTicketValidation)->getRules();

        if( ! $this->validate($rules)) {
            return redirect()->back()->with('danger', 'Verifique os erros e tente novamente')
            ->with('errors', $this->validator->getErrors())
            ->withInput();
        }

        $storeService = new StoreTicketService;

        if(! $storeService->createSingle(validatedData: $this->validator->getValidated())) {
            return redirect()->back()->with('danger', 'Verifique os erros e tente novamente');
        }
        return redirect()->route('parking')->with('success', 'Sucesso');
    }
}