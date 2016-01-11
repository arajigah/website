'use strict'

angular.module('zooKeepr').config(['$stateProvider', '$urlRouterProvider', function($stateProvider, $urlRouterProvider){
    
    $urlRouterProvider.otherwise('/');
    
    $stateProvider.state('enclosure', {
        url:'/enclosure',
        templateUrl: '/js/templates/enclosure.tpl.html',
        controller: 'viewCtrl'
    })
    .state('animal', {
        url:'/animal',
        templateUrl: '/js/templates/animal.tpl.html',
        controller: 'viewCtrl'
    })
    .state('food', {
        url:'/food',
        templateUrl: '/js/templates/food.tpl.html',
        controller: 'viewCtrl'
    });
}]);