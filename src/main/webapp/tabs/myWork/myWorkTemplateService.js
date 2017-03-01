var app = angular.module('myApp');
app.constant('URL', 'data/');
app.factory('myWorkTemplateService', function ($http, URL) {
	debugger;
    var getWorkTemplates = function () {
        return $http.get(URL + 'myWorkTemplate.json');
    };

    return {
    	getWorkTemplates: getWorkTemplates
    };
});
