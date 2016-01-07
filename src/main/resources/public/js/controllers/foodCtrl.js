'use strict';

angular.module('zooKeepr').controller('foodCtrl', ['$scope', '$http', '$log', 'foodFactory', 
function($scope, $http, $log, foodFactory){
	
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