<?php

use App\Controllers\CustomersController;
use App\Controllers\CategoriesController;
use App\Controllers\HomeController;
use App\Controllers\CompanyController;
use App\Controllers\SingleTicketsController;
use App\Controllers\Parking\Controller;
use CodeIgniter\Router\RouteCollection;

/**
 * @var RouteCollection $routes
 */
$routes->get('/', [HomeController::class, 'index'], ['as' => 'home']);

$routes->group('categories', static function ($routes) {
    $routes->get('/', [CategoriesController::class, 'index'], ['as' => 'home']);
    $routes->get('new', [CategoriesController::class, 'new'], ['as' => 'categories.new']);
    $routes->get('create', [CategoriesController::class, 'new'], ['as' => 'categories.create']);
    $routes->get('edit/(:segment)', [CategoriesController::class, 'new'], ['as' => 'categories.edit']);
    $routes->get('update/(:segment)', [CategoriesController::class, 'new'], ['as' => 'categories.update']);
    $routes->get('delete/(:segment)', [CategoriesController::class, 'new'], ['as' => 'categories.delete']);
});

$routes->group('customers', static function ($routes) {
    $routes->get('/', [CustomersController::class, 'index'], ['as' => 'home']);
    $routes->get('new', [CustomersController::class, 'new'], ['as' => 'categories.new']);
    $routes->get('create', [CustomersController::class, 'new'], ['as' => 'categories.create']);
    $routes->get('edit/(:segment)', [CustomersController::class, 'new'], ['as' => 'categories.edit']);
    $routes->get('update/(:segment)', [CustomersController::class, 'new'], ['as' => 'categories.update']);
    $routes->get('delete/(:segment)', [CustomersController::class, 'new'], ['as' => 'categories.delete']);
});

$routes->group('company', static function ($routes) {
    $routes->get('/', [CompanyController::class, 'index'], ['as' => 'company']);
    $routes->match(['post', 'put'], 'process', [CompanyController::class, 'process'], ['as' => 'company.process']);
});

// Estacionamento
$routes->group('parking', static function ($routes) {
    $routes->get('/', [ParkingController::class, 'index'], ['as' => 'parking']);

    $routes->group('single', static function ($routes) {
        $routes->get('/', [SingleTicketsController::class, 'new'], ['as' => 'parking']);
    
        
    });
});


// Tickets avulsos