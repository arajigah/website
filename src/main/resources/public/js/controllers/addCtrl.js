'use strict'
angular.module('zooKeepr').controller('addCtrl', ['$scope', '$http', '$uibModal', '$log', 
function($scope, $http, $uibModal, $log){
	
	$scope.animationsEnabled = true;
	
	$scope.newEnclosure = function(size) {
		var modalInstance = $uibModal.open({
			animation: $scope.animationsEnabled,
		    templateUrl: 'templates/newEnclosureModal.tpl.html',
		    controller: 'newEnclosureInstanceCtrl',
		    size: size
		});
	};
	
	$scope.newAnimal = function(size) {
		var modalInstance = $uibModal.open({
			animation: $scope.animationsEnabled,
		    templateUrl: 'templates/newAnimalModal.tpl.html',
		    controller: 'newAnimalInstanceCtrl',
		    size: size
		});
	};
	
	$scope.newFood = function(size) {
		var modalInstance = $uibModal.open({
			animation: $scope.animationsEnabled,
		    templateUrl: 'templates/newFoodModal.tpl.html',
		    controller: 'newFoodInstanceCtrl',
		    size: size
		});
	};
	
	
	
}]);