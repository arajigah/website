angular.module('zooKeepr').factory('enclosureConditionFactory', ['$http', function($http){
	return{
		getAllEnclosureConditions: function() {
			return $http.get('/condition');
		},
		
		getEnclosureConditionsById: function(id) {
			return $http.get('/condition/' + id);
		}
	}
}]);