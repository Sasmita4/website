var app = angular.module('myApp', []);
app.directive('myWork-item', function ($compile, MyWorkService, MyWorkDataService) {
	
	app.constant('URL','/myWork');
	
	app.factory('MyWorkDataService', function ($http, URL) {
	    var getMyWorkData = function () {
	        return $http.get(URL + 'myWorksData.json');
	    };

	    return {
	    	getMyWorkData: getMyWorkData
	    };
	});
	
	//to get the myWorkTemplate from json 
    app.factory('MyWorkService', function ($http, URL) {
        var getMyWorkTemplate = function () {
            return $http.get(URL + 'myWorksTemplate.json');
        };

        return {
        	getMyWorkTemplate: getMyWorkTemplate
        };
    });
    
    
   //method used inside
    var getMyWorkTemplate = function (templates, contentType) {
    	var template = '';
    	
    	switch (contentType) {
    	case 'image':
    		template = templates.imageTemplate;
    		break;
    	}
    	
    	return template;
    };
});