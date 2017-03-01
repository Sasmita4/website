var app = angular.module('myApp');
app.factory('galleryAndVideoService', function ($http, URL) {
    var getData = function () {
    	return $http.get("/galleryAndVideos");
    };
    return {
        getData: getData
    };
});
