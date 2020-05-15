appUserManager.controller("mainController", function($scope, $http, $location) {
	$scope.logInOutButton = 'Logout';

	$scope.logout = function() {
		$scope.logInOutButton = 'Login'
		localStorage.removeItem('userIn');
		$location.path('/login')
	}
});