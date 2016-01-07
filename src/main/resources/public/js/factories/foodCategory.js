angular.module('zooKeepr').factory('foodCategory', ['$http', function($http){
	return {
		getAllFoodCategories: function() {
			return $http.get('/foodCategory');
		},
		
		getFoodCategoryById: function() {
			return $http.get('/foodCategory/' + id);
		}
	}
}])