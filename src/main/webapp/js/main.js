var app=angular.module('myApp', ['ui.router'])
  .config(['$stateProvider', '$urlRouterProvider', 
    function($stateProvider, $urlRouterProvider) {
      $urlRouterProvider.otherwise('/');
      $stateProvider
        .state('home1', {
          url: '/',
          views: {
            '': { templateUrl: '/index.html'},
            'home@home1': { templateUrl: '/webapp/tabs/home/home.html' },
            'aboutMe@home1': { templateUrl: '/webapp/tabs/aboutMe/aboutMe.html'},
            'myWork@home1': { templateUrl: '/webapp/tabs/myWork/myWork.html' },
            'gallery&Videos@home1': { templateUrl: '/webapp/tabs/gallery&Videos/gallery&Videos.html' },
            'contact@home1': { templateUrl: '/webapp/tabs/contact/contact.html' }
         }
      });
      app.controller("ItemController",
    		  function ($scope, $location, $anchorScroll) {
    		  $scope.terms = {
    		    "home":["Home"],
    		    "aboutMe":["AboutMe"],
    		    "gallery&Videos":["Gallery/Videos"],
    		    "myWork":["MyWork"],
    		    "contact":["Contact"]
    		  };
    		  $scope.jumpToLocation = function(key){
    		    $location.hash(key);
    		    $anchorScroll();
    		  }
    		  });
    }
  
  ]);