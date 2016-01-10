'use strict';

angular.module('zooKeepr').controller('newFoodInstanceCtrl', ['$scope', '$location', '$uibModalInstance', '$log', '$state', 'vendors', 'foodCategories', 'foodFactory',
function($scope, $location, $uibModalInstance, $log, $state, vendors, foodCategories, foodFactory){
	
	$scope.vendors = vendors.data;
	$scope.vendor = {};
	$scope.vendor.name = "";
	$scope.foodCategories = foodCategories.data;
	$scope.foodCategory = {};
	$scope.food = {};
	$scope.food.vendor = {};
	$scope.food.name = "";
	
	$scope.reloadRoute = function() {
	    $state.reload();
	};
	
	$scope.addFood = function() {
		$scope.food.vendor = $scope.vendor;
		$scope.food.category = $scope.foodCategory;
		$scope.data = JSON.stringify($scope.food);
		console.log($scope.food);
		foodFactory.addFood($scope.data).then(function(results){
			$uibModalInstance.dismiss('saved');
			$scope.reloadRoute();
			console.log("new food saved");
		});
	};
	
	$scope.cancel = function() {
		$uibModalInstance.dismiss('cancel');
	};
	
}]);