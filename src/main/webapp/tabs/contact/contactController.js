angular.module("myApp")
	.controller('contactController',['$scope','entity','$state','$http','sendEmailService',
        function($scope,$state, $http,sendEmailService) {
		$scope.sendEmail = function(){
			sendEmailService.send($scope.contact);
		}
	}]);