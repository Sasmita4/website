var app = angular.module('myApp');
app.controller('galleryAndVideoController', function (galleryAndVideoService) {
    var ctrl = this;
    ctrl.content = [];
    ctrl.fetchContent = function () {
    	galleryAndVideoService.getData().then(function (result) {
            ctrl.content = result.data;
        });
    };
    ctrl.fetchContent();
});