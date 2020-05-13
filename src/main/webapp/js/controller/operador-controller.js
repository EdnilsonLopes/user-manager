appUserManager.controller("operadorController", function($scope, $http) {
	$scope.buttonText = "Salvar"
	$scope.operadores = [];
	$scope.operador = {};

	$scope.loadAllOperadores = function() {
		$http({
			method : 'GET',
			url : 'http://localhost:8080/operadores/all'
		}).then(function(response) {
			$scope.operadores = response.data;
		});
	}

	$scope.loadAllOperadores();

	$scope.saveOperador = function() {
		if ($scope.operadorForm.$valid) {
			$http({
				method : 'POST',
				url : 'http://localhost:8080/operadores/save',
				data : $scope.operador
			}).then(function(response) {
				isNewItem = true;
				for (i = 0; i < $scope.operadores.length; i++) {
					if (response.data.id == $scope.operadores[i].id) {
						isNewItem = false;
						break;
					}
				}
				if (isNewItem) {
					$scope.operadores.push(response.data);
				} else {
					for (i = 0; i < $scope.operadores.length; i++) {
						if (response.data.id == $scope.operadores[i].id) {
							$scope.operadores[i] = response.data;
							break;
						}
					}
				}
				$scope.operador = {};
			});
			$scope.operadorForm.$setDirty(false);
		} else {
			$scope.operadorForm.$setDirty(true);
		}
	}

	$scope.updateOperadorInit = function(operador) {
		$scope.operador = angular.copy(operador);
		$scope.buttonText = "Atualizar";
	}

	$scope.deleteOperador = function(operador) {
		$http({
			method : 'DELETE',
			url : 'http://localhost:8080/operadores/delete/' + operador.id
		}).then(function(response) {
			var index = $scope.operadores.indexOf(operador);
			$scope.operadores.splice(index, 1);
		});
	}

	$scope.cancelUpdateOperador = function() {
		$scope.operador = {};
	}

});
