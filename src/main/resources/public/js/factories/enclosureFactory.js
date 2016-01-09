angular.module('zooKeepr').factory('enclosureFactory', ['$http', function($http){
    return {
        getAllEnclosures: function() {
            return $http.get('/enclosure');method=RequestMethod.GETmethod=RequestMethod.GETmethod=RequestMethod.GET
        },
        
        getEnclosuresById: function(id) {
            return $http.get('/enclosure/' + id);
        },
        
        addEnclosure: function(enclosure) {
            return $http.post('/enclosure', enclosure);
        },
        
        updateEnclosureById: function(id) {
        	return $http.put('/enclosure' + id);
        },
        
        deleteEnclosureById: function(id) {
            return $http.delete('/enclosure/' + id);
        }
    }
}]);