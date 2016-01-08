'use strict'

angular.module('zooKeepr').config(['$stateProvider', '$urlRouterProvider', function($stateProvider, $urlRouterProvider){
    
    $urlRouterProvider.otherwise('/');
    
    $stateProvider.state('enclosure', {
        url:'/enclosures',
        templateUrl: '/js/templates/enclosure.tpl.html',
        controller: 'enclosureCtrl'
    })
    .state('animal', {
        url:'/animals',
        templateUrl: 'templates/animal.tpl.html',
        controller: 'contentCtrl'
    })
    .state('food', {
        url:'/food',
        templateUrl: 'templates/food.tpl.html',
        controller: 'contentCtrl'
    });
}]);