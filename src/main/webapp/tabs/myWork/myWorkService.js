var app = angular.module('myApp');
app.factory('myWorkService', function ($http, URL) {
    var getMyWorkTemplate = function () {
        return $http.get("/myWork");
    };
    return {
    	getMyWorkTemplate: getMyWorkTemplate
    };
});
