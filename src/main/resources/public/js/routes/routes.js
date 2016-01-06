'use strict'

angular.module('zooKeepr').config(['$stateProvider', '$urlRouterProvider', function($stateProvider, $urlRouterProvider){
    
    $urlRouterProvider.otherwise('/');
    
    $stateProvider.state('enclosure', {
        url:'/enclosure',
        templateUrl: 'templates/enclosure.tpl.html',
        controller: ''
    })
    .state('animal', {
        url:'/animal',
        templateUrl: 'templates/animal.tpl.html',
        controller: ''
    })
    .state('food', {
        url:'/food',
        templateUrl: 'templates/food.tpl.html'
    });
}]);