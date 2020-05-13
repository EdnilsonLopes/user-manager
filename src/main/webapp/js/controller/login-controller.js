appUserManager.controller("loginController", function($scope, $http) {
	$scope.usuario = {}

	$scope.login = function() {
		$http.post("/operadores/login", $scope.usuario).then(function(response) {
			console.log("Sucesso!" + response.data);
			
		}, function(response) {
			console.log("Falha!" + response.data);
		})
	}
})