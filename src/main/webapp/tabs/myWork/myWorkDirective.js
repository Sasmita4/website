var app = angular.module('myApp');
app.directive('myworkItem', function ($compile, myWorkTemplateService) {
    
	debugger;
   //method used inside
    var getWorkTemplate = function (templates) {
    	var template = '';
    		template = templates.myWorkTemplate;
    	return template;
    };
    var linker = function (scope, element, attrs) {
    	myWorkTemplateService.getWorkTemplates().then(function (response) {
            var templates = response.data;

            element.html(getWorkTemplate(templates));

            $compile(element.contents())(scope);
        });
    };

    return {
        restrict: 'E',
        link: linker,
        scope: {
            content: '='
        }
    };
});