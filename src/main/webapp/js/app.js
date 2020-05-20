var appUserManager = angular.module("appUserManager", [ 'ngRoute', 'ngMask' ]);

appUserManager.config(function($routeProvider, $locationProvider) {
	$routeProvider.when('/', {
		templateUrl : 'prova/view/login.html',
		controller : 'loginController'
	}).when('/operadores', {
		templateUrl : 'prova/view/operadores.html',
		controller : 'operadorController'
	}).when('/pessoas', {
		templateUrl : 'prova/view/pessoas.html',
		controller : 'pessoaController'
	}).when('/telefones', {
		templateUrl : 'prova/view/telefones.html',
		controller : 'telefoneController'
	}).when('/login', {
		templateUrl : 'prova/view/login.html',
		controller : 'loginController'
	}).otherwise({
		redirectTo : '/'
	});

	$locationProvider.html5Mode({
		enabled : true,
		requireBase : false
	});

	function isAdmin() {
		operadorAutenticado = JSON.parse(localStorage.getItem('userIn'));
		return operadorAutenticado.perfil.equals("ADMINISTRADOR");
	}

	function isEditPessoa() {
		operadorAutenticado = JSON.parse(localStorage.getItem('userIn'));
		return operadorAutenticado.perfil.equals("GERENTE");
	}

	function isEditTelefone() {
		operadorAutenticado = JSON.parse(localStorage.getItem('userIn'));
		return operadorAutenticado.perfil.equals("ANALISTA");
	}
	function isAuthenticated() {
		operadorAutenticado = JSON.parse(localStorage.getItem('userIn'));
		return operadorAutenticado.perfil != undefined;
	}
});
