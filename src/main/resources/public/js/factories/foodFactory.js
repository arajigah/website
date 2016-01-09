angular.module('zooKeepr').factory('foodFactory', ['$http', function($http){
    return {
        getAllFood: function() {
            return $http.get('/food');
        },
        
        getFoodById: function(id) {
            return $http.get('/food' + id);
        },
        
        addFood: function(food) {
            return $http.post('/food', food);
        }
        
        updateFoodById: function(food, id) {
        	return $http.put('/food/' + id, food);
        },
        
        deleteFoodById: function(id) {
        	return $http.delete('/food/' + id);
        }
    }
}]);