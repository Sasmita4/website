angular.module("myApp")
	.controller('contactController',
        function($scope,contactService) {
		$scope.send = function(){
			contactService.sendEmail($scope.contact);
	   }
	});