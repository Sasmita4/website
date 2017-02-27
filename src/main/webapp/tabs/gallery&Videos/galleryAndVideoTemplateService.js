var app = angular.module('myApp');
app.constant('URL', 'data/');
app.factory('TemplateService', function ($http, URL) {
    var getTemplates = function () {
        return $http.get(URL + 'templates.json');
    };

    return {
        getTemplates: getTemplates
    };
});
