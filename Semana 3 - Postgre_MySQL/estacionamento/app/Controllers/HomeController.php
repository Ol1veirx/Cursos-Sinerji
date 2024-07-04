<?php

namespace App\Controllers;

class HomeController extends BaseController
{
    private const VIEWS_DIRECTORY = 'Home/';
    public function index(): string
    {
    $this->dataToView['title'] = 'voce esta na home';

       $this->dataToView['curso'] = 'curso de codeigniter';

        return view(self::VIEWS_DIRECTORY. 'index', $this->dataToView);
    }
}
