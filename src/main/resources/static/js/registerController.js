var cartApp = angular.module('loginApp', []);

      cartApp.controller('loginCtrl', function($scope,
      $http) {

          $scope.submit = function(data) {
              alert(data);
                  });
          };
          $scope.removeFromCart = function(productId) {
              $http.put('/webstore/rest/cart/remove/' +
      productId)
                  .success(function(data) {
                      $scope.refreshCart($scope.cartId);
                  });
          };
      });