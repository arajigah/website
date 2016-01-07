angular.module('zooKeepr').factory('enclosureFactory', ['$http', function($http){
    return {
        getAllEnclosures: function() {
            return $http.get('/enclosure')
        },
        
        getEnclosuresById: function(id) {
            return $http.get('/enclosure/' + id);
        },
        
        addEnclosure: function(animal) {
            return $http.add('/enclosure', enclosure);
        },
        
        deleteEnclosureById: function(id) {
            return $http.delete('/enclosure/' + id);
        }
    }
}]);