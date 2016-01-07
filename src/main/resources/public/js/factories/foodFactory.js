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
    }
}]);