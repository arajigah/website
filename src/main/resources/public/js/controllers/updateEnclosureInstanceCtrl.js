'use strict';

angular.module('zooKeepr').controller('updateEnclosureInstanceCtrl', ['$scope', '$location', '$uibModalInstance', '$log', '$state', 'enclosureEdit', 'animals', 'enclosureConditions', 'enclosureFactory',
function($scope, $location, $uibModalInstance, $log, $state, enclosureEdit, animals, enclosureConditions, enclosureFactory){
	
	$scope.cancel = function() {
		$uibModalInstance.dismiss('cancel');
	}
	$scope.reloadRoute = function() {
	    $state.reload();
	};
	
	$scope.animals = animals.data;
	$scope.enclosureConditions = enclosureConditions.data;
	$scope.animal = {};
	$scope.enclosureCondition = {};
	$scope.enclosure = {};
	$scope.enclosure.name = "";
	$scope.enclosure.numOfAnimals = "";
	$scope.enclosure.feedTime = {};
	
	
	$scope.feedTime = new Date();
	$scope.feedTime.setMinutes(0);
	$scope.feedTime.setHours(0);
	  
	  $scope.hstep = 1;
	  $scope.mstep = 15;
	
	  $scope.options = {
	    hstep: [1, 2, 3],
	    mstep: [1, 5, 10, 15, 25, 30]
	  };
	  
	  $scope.enclosure.name = enclosureEdit.data.name;
	  $scope.enclosure.numOfAnimals = enclosureEdit.data.numOfAnimals;
	  $scope.animal= enclosureEdit.data.animal;
	  $scope.enclosure.feedTime = enclosureEdit.data.feedTime;
	  
	  
	  
	  
	  
	  $scope.updateEnclosure = function(enclosure, animal, feedTime, numOfAnimals, condition) {
		  $scope.enclosure.id = enclosureEdit.data.id;
		  console.log(enclosureEdit.data);
		  $scope.feedTime.setSeconds(0);
		  $scope.feedTime.setMilliseconds(0);
		  var feedingTime = $scope.feedTime.getTime()
		  $scope.enclosure.condition = $scope.enclosureCondition;
		  $scope.enclosure.animal = $scope.animal;
		  $scope.enclosure.feedTime = feedingTime;
		  $scope.data = JSON.stringify($scope.enclosure);
		  enclosureFactory.updateEnclosureById($scope.data, $scope.enclosure.id).then(function(results){
			  $scope.reloadRoute();
			  $uibModalInstance.dismiss('updated');
		  });
		  
	  }
}]);