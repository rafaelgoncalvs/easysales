var app = require('app');

app.config(['$routeProvider', function($routeProvider) {
	$routeProvider
		.when('/sales', {
			templateUrl: 'app/sales/sales.html',
			controller: 'SalesController'
		})
		.when('/sales/:saleId', {
			templateUrl: 'app/sale/sale.html',
			controller: 'SaleController'
		})
		.when('/login', {
      		templateUrl: 'app/authenticator/login.html',
      		controller: 'AuthenticatorController'
    	})
		.otherwise({
			redirectTo: '/sales'
		});
}]);