var app = angular.module('myApp');
app.factory('galleryAndVideoService', function ($http, URL) {
	app.constant('URL', 'data/');
    var getData = function () {
        return $http.get(URL + 'content.json');
    };
    return {
        getData: getData
    };
});
