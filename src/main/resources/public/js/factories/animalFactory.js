angular.module('zooKeepr').factory('animalFactory', ['$http', function($http){
    return {
        getAllAnimals: function() {
            return $http.get('/animal');
        },
        
        getAnimalById: function(id) {
            return $http.get('/animal/' + id);
        },
        
        addAnimal: function(animal) {
            return $http.post('/animal', animal);
        },
        
        updateAnimalById: function(animal, id) {
        	return $http.put('/animal/' + id, animal);
        },
    }
}]);