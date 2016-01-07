'use strict';

angular.module('zooKeepr').controller('foodCtrl', ['$scope', '$http', '$log', 'foodFactory', 
function($scope, $http, $log, foodFactory){
	
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
])};