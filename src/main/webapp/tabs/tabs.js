var app = angular.module('myApp', []);

app.config(function ($sceDelegateProvider) {
    $sceDelegateProvider.resourceUrlWhitelist(['self', '**']);
});

//Using AnchorScroll
app.controller("itemController",
function ($scope, $location, $anchorScroll,$http) {
$scope.terms = {
  "home":["Home"],
  "aboutMe":["AboutMe"],
  "gallery&Videos":["Gallery/Videos"],
  "myWork":["MyWork"],
  "contact":["Contact"]
};
$scope.jumpToLocation = function(key){
  $location.hash(key);
  $anchorScroll();
}
});



