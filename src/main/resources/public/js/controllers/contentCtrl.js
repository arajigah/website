'use strict';

angular.module('zooKeepr').controller('contentCtrl', ['$scope', '$http', '$log', 'enclosureFactory', 'animalFactory', 'foodFactory', 
function($scope, $http, $log, enclosureFactory, animalFactory, foodFactory){
	
	$scope.getEnclosureList = function() {
		enclosureFactory.getAllEnclosures().then(
			function(success) {
				$scope.enclosureList = success.data;
				console.log($scope.enclosureList);
			},
			function(error) {
				$scope.enclosureList = error.data;
				console.log('error');
			});
	};
	
	$scope.getEnclosureList();
	
	
	
	$scope.getAnimalList = function() {
		animalFactory.getAllAnimals().then(
			function(success) {
				$scope.animalList = success.data;
				console.log($scope.animalList);
			},
			function(error) {
				$scope.animalList = error.data;
				console.log('error');
			});
	};
	
	$scope.getAnimalList();
	
	
	
	$scope.getFoodList = function() {
		animalFactory.getAllFood().then(
			function(success) {
				$scope.foodList = success.data;
				console.log($scope.foodList);
			},
			function(error) {
				$scope.foodList = error.data;
				console.log('error');
			});
	};
	
	$scope.getFoodList();
	
}]);