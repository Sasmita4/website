var app = angular.module('myApp');
app.controller('backgroundController',function ($scope,$http,$sce) {
	var responsePromise = $http.get('/backgroundUrl');
	responsePromise.success(function(data, status, headers, config) {
		$scope.backgroundVideo = data[0].url;
	});
	responsePromise.error(function(data, status, headers, config) {	
	//Console.log("Failed to load data . Please try again !");
	});
});