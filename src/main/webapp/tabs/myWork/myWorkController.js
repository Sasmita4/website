var app = angular.module('myApp');
app.controller('myWorkController', function (myWorkService) {
    var work = this;
    work.content = [];
    work.fetchWContent = function () {
    	myWorkService.getMyWorkTemplate().then(function (result) {
    		work.content = result.data;
        });
    };
    work.fetchWContent();
}); 