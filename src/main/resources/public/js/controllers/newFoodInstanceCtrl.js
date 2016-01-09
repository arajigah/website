'use strict';

angular.module('zooKeepr').controller('newFoodInstanceCtrl', ['$scope', '$location', '$uibModalInstance', '$log', 'vendors', 'foodCategories', 'foodFactory',
function($scope, $location, $uibModalInstance, $log, vendors, foodCategories, foodFactory){
	
	$scope.vendors = vendors.data;
	$scope.vendor = {};
	$scope.foodCategories = foodCategories.data;
	$scope.foodCategory = {};
	$scope.food = {};
	$scope.food.name = "";
	
	$scope.addFood = function() {
		$scope.food.vendor = $scope.vendor;
		$scope.food.category = $scope.foodCategory;
		$scope.data = JSON.stringify($scope.food);
		foodFactory.addFood($scope.data).then(function(results){
			$uibModalInstance.dismiss('saved');
			console.log("new food saved");
		});
	};
	
	$scope.cancel = function() {
		$uibModalInstance.dismiss('cancel');
	};
	
}]);