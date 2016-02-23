var app = require('app');

app.controller('SalesController', function($scope, $http) {
	$http.get('http://localhost:8080/easysales-api/rest/sales').success(function(data) {
		$scope.sales = data;
    });	
});