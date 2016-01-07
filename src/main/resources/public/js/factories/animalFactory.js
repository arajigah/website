angular.module('zooKeepr').factory('animalFactory', ['$http', function($http){
    return {
        getAllAnimals: function() {
            return $http.get('/animal')
        },
        
        getAnimalById: function(id) {
            return $http.get('/animals' + id);
        },
        
        addAnimal: function(animal) {
            return $http.post('/animal', animal);
        },
        
        updateAnimal: function() {
        }
    }
}]);