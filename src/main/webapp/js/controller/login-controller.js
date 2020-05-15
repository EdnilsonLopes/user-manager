appUserManager.controller("loginController",
		function($scope, $http, $location) {
			$scope.usuario = {};
			$scope.token = "";

			$scope.login = function() {
				$http.post("/user/login", $scope.usuario).then(
						function(response) {
							userIn = JSON.stringify(response.data);
							localStorage.setItem('userIn', userIn);
							$location.path("/operadores");
						}, function(response) {
							window.alert("Login e/ou Senha inválidos!");
						})
			}
		})