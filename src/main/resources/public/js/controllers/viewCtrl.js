'use strict'
angular.module('zooKeepr').controller('viewCtrl', ['$scope', '$http', '$log', '$uibModal', '$state', 'enclosureFactory', 'animalFactory', 'foodFactory', 'enclosureConditionFactory', 'vendorFactory', 'foodCategoryFactory', 
function($scope, $http, $log, $uibModal, $state, enclosureFactory, animalFactory, foodFactory, enclosureConditionFactory, vendorFactory, foodCategoryFactory){
	
	$scope.toggleAnimation = function () {
	    $scope.animationsEnabled = !$scope.animationsEnabled;
	  };
	  
	  $scope.reloadRoute = function() {
		    $state.reload();
		};
	
	
	$scope.getEnclosureList = function() {
		enclosureFactory.getAllEnclosures().then(
			function(success) {
				$scope.enclosureList = success.data;
			},
			function(error) {
				$scope.enclosureList = error.data;
				console.log('error');
			});
	};	
	
	$scope.getAnimalList = function() {
		animalFactory.getAllAnimals().then(
			function(success) {
				$scope.animalList = success.data;
			},
			function(error) {
				$scope.animalList = error.data;
				console.log('error');
			});
	};	
	
	$scope.getFoodList = function() {
		foodFactory.getAllFood().then(
			function(success) {
				$scope.foodList = success.data;
			},
			function(error) {
				$scope.foodList = error.data;
				console.log('error');
			});
	};
	
	$scope.getEnclosureList();
	$scope.getAnimalList();
	$scope.getFoodList();
	
	
	
	$scope.animationsEnabled = true;
	
	$scope.newEnclosure = function(size) {
		var modalInstance = $uibModal.open({
			animation: $scope.animationsEnabled,
		    templateUrl: 'js/templates/newEnclosureModal.tpl.html',
		    controller: 'newEnclosureInstanceCtrl',
		    size: size,
		    resolve: {animals:function(animalFactory){
		    	return animalFactory.getAllAnimals();
		    },
		    enclosureConditions:function(enclosureConditionFactory){
		    	return enclosureConditionFactory.getAllEnclosureConditions();
		    }}
		});
	};
	
	$scope.newAnimal = function(size) {
		var modalInstance = $uibModal.open({
			animation: $scope.animationsEnabled,
		    templateUrl: 'js/templates/newAnimalModal.tpl.html',
		    controller: 'newAnimalInstanceCtrl',
		    size: size,
		    resolve: {food:function(foodFactory){
		    	return foodFactory.getAllFood();
		    }}
		});
	};
	
	$scope.newFood = function(size) {
		var modalInstance = $uibModal.open({
			animation: $scope.animationsEnabled,
		    templateUrl: 'js/templates/newFoodModal.tpl.html',
		    controller: 'newFoodInstanceCtrl',
		    size: size,
		    resolve: {vendors:function(vendorFactory){
		    	return vendorFactory.getAllVendors();
		    },
		    foodCategories:function(foodCategoryFactory){
		    	return foodCategoryFactory.getAllFoodCategories();
		    }}
		});
	};
	
	
	  
	$scope.editEnclosure = function(id) {
		var updateEnclosureModalInstance = $uibModal.open({
			animation: $scope.animationsEnabled,
			templateUrl: 'js/templates/editEnclosureModal.tpl.html',
			controller: 'updateEnclosureInstanceCtrl',
			resolve: {enclosureEdit:function(enclosureFactory){
				return enclosureFactory.getEnclosuresById(id);
			},
			animals:function(animalFactory){
				return animalFactory.getAllAnimals();
			},
			enclosureConditions:function(enclosureConditionFactory){
				return enclosureConditionFactory.getAllEnclosureConditions();
			}}
		});
	};
	
	  
	
	  
	$scope.deleteEnclosure = function(id) {
		$scope.data = JSON.stringify($scope.enclosure);
		enclosureFactory.deleteEnclosureById(id).then(function(results){
			$scope.reloadRoute();
			console.log("enclosure deleted");
		});
	};
	
}]);