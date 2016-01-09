'use strict';

angular.module('zooKeepr').controller('newEnclosureInstanceCtrl', ['$scope', '$location', '$uibModalInstance', '$log', 'animals', 'enclosureConditions', 'enclosureFactory',
function($scope, $location, $uibModalInstance, $log, animals, enclosureConditions, enclosureFactory){
		
	$scope.animals = animals.data;
	$scope.enclosureConditions = enclosureConditions.data;
	$scope.animal = {};
	$scope.enclosureCondition = {};
	$scope.enclosure = {};
	$scope.enclosure.name = "";
	$scope.enclosure.numOfAnimals = "";
	$scope.enclosure.feedTime = {};
	
	
	$scope.cancel = function() {
		$uibModalInstance.dismiss('cancel');
	}
	
	
	$scope.feedTime = new Date();
	$scope.feedTime.setMinutes(0);
	$scope.feedTime.setHours(0);
	  
	  $scope.hstep = 1;
	  $scope.mstep = 15;
	
	  $scope.options = {
	    hstep: [1, 2, 3],
	    mstep: [1, 5, 10, 15, 25, 30]
	  };
	
	  $scope.changed = function () {
	    $log.log('Time changed to: ' + $scope.mytime);
	  };
	  
	  $scope.addEnclosure = function() {
		  $scope.feedTime.setSeconds(0);
		  $scope.feedTime.setMilliseconds(0);
		  var feedingTime = $scope.feedTime.getTime()
		  $scope.enclosure.condition = $scope.enclosureCondition;
		  $scope.enclosure.animal = $scope.animal;
		  $scope.enclosure.feedTime = feedingTime;
		  $scope.data = JSON.stringify($scope.enclosure);
		  enclosureFactory.addEnclosure($scope.data).then(function(results){
			  $uibModalInstance.dismiss('saved');
		  });
	  };
	  
	  $scope.updateEnclosure = function() {
		  $scope.feedTime.setSeconds(0);
		  $scope.feedTime.setMilliseconds(0);
		  var feedingTime = $scope.feedTime.getTime()
		  $scope.enclosure.condition = $scope.enclosureCondition;
		  $scope.enclosure.animal = $scope.animal;
		  $scope.enclosure.feedTime = feedingTime;
		  $scope.data = JSON.stringify($scope.enclosure);
		  enclosureFactory.addEnclosure($scope.data).then(function(results){
			  $uibModalInstance.dismiss('saved');
		  });
		  
	  }
	
}]);