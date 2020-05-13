var appUserManager = angular.module("appUserManager", [ 'ngRoute' ]);

appUserManager.config(function($routeProvider, $locationProvider) {
	$routeProvider.when('/operadores', {
		templateUrl : 'view/operadores.html',
		controller : 'operadorController'
	}).when('/pessoas', {
		templateUrl : 'view/pessoas.html',
		controller : 'pessoaController'
	}).when('/login', {
		templateUrl : 'view/login.html',
		controller : 'loginController'
	}).otherwise({
		redirectTo : '/'
	});

	$locationProvider.html5Mode({
		enabled : true,
		requireBase : false
	});
});