'use strict';

angular.module('zooKeepr').controller('newAnimalInstanceCtrl', ['$scope', '$location', '$uibModalInstance', '$log', 'food', 'animalFactory',
function($scope, $location, $uibModalInstance, $log, food, animalFactory){
	
	$scope.foods = food.data;
	$scope.food = {};
	$scope.animal = {};
	$scope.animal.name = "";
	$scope.animal.sciName = "";
	$scope.animal.infoLink = "";
	
	$scope.addAnimal = function() {
		$scope.animal.favFood = $scope.food;
		$scope.data = JSON.stringify($scope.animal);
		animalFactory.addAnimal($scope.data).then(function(results){
			$uibModalInstance.dismiss('saved');
			console.log("new animal saved");
		});
	};	
	
	$scope.cancel = function() {
		$uibModalInstance.dismiss('cancel');
	};
	
}]);