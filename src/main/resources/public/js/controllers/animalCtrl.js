'use strict';

angular.module('zooKeepr').controller('animalCtrl', ['$scope', '$http', '$log', 'animalFactory', 
function($scope, $http, $log, animalFactory){
	
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
}]);