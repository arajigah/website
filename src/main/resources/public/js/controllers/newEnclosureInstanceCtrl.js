'use strict';

angular.module('zooKeepr').controller('newEnclosureInstanceCtrl', ['$scope', '$location', '$uibModalInstance', 'enclosureFactory', 'animalFactory', 'enclosureConditonFactory',
function($scope, $location, $uibModalInstance, enclosureFactory, animalFactory, enclosureConditonFactory){
	
	$scope.getEnclosureCondtionList = function() {
		enclosureConditonFactory.getAllEnclosureCoditions().then(
				function(success){
					$scope.enclosureConditions = success.data;
				},
				function(error){
					$scope.enclosureConditons = error.data;
				});
	};
	
		
	$scope.getAnimalList = function() {
		animalFactory.getAllAnimals().then(
				function(success){
					$scope.animals = success.data;
				},
				function(error){
					$scope.animals = error.data;
				});
	};
	
	$scope.getEnclosureConditionList();
	$scope.getAnimalList();
	$scope.enclosure = {};
	$scope.enclosure.name = "";
	$scope.enclosure.numOfAnimals = "";
	$scope.enclosure.feedTime = "";
	
	
	$scope.cancel = function() {
		$uibModalInstance.dismiss('cancel');
	}
	
}]);