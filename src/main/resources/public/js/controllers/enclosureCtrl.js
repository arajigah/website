'use strict';

angular.module('zooKeepr').controller('enclosureCtrl', ['$scope', '$http', '$log', 'enclosureFactory', 
function($scope, $http, $log, enclosureFactory){
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
)]};