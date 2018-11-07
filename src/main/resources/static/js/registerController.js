var app = angular.module('eComApp', ["ngRoute"]);

app.config(function($routeProvider) {
    $routeProvider
    .when("/ecom", {
        templateUrl : "index.htm",
    })
    .when("/register", {
        templateUrl : "/web/getregisterform",
        controller : "regCtrl"
    })
    .when("/login", {
        templateUrl : "/web/getloginform",
        controller : "loginCtrl"
    })
    .when("/item",{
        templateUrl : "/web/getitem",
        controller : "itemCtrl"
    });
});



app.controller('regCtrl', function($scope, $http)
{
    $scope.submit = function()
    {
         $http({
            method : "POST",
            url : "/register",
            data: $scope.user
        }).then(function mySuccess(response) {
            $scope.myWelcome = response.data;
        }, function myError(response) {
            $scope.error = response.statusText;
        });
    }
});


app.controller('loginCtrl', function($scope, $http,$rootScope)
{
    $scope.login = function()
    {
         $http({
            method : "GET",
            url : "/login",
            params: {_username: $scope.user.userName,password:$scope.user.password}
        }).then(function mySuccess(response) {
            if(response.status === 200 || response.data === "")
            {
                $scope.myWelcome = response.data;
                $rootScope.loginDisabled=true;
                $rootScope.regDisabled=true;
                $rootScope.showLogout=false;
            }
        }, function myError(response) {
                $scope.myWelcome = response.data.message;
                 $scope.myError = response.data.status;
        });
    }
});

app.controller('itemCtrl', function($scope, $http,$rootScope)
{
     $http({
        method : "GET",
        url : "/getallItems"
    }).then(function mySuccess(response) {
        if(response.status === 200 || response.data === "")
        {
            $scope.products = response.data;
        }
    }, function myError(response) {
            $scope.myWelcome = response.data.message;
             $scope.myError = response.data.status;
    });
});
