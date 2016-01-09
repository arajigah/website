angular.module('zooKeepr').factory('vendorFactory', ['$http', function($http){
	return {
		getAllVendors: function() {
			return $http.get('/vendor');
		},
		
		getVendorById: function(id) {
			return $http.get('/vendor/' + id);
		}
	}
}]);