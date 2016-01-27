var app = require('app');

app.config(['$routeProvider', function($routeProvider) {
	$routeProvider
		.when('/sales', {
			templateUrl: 'app/sales.html',
			controller: 'SalesController'
		})
		.when('/sales/:saleId', {
			templateUrl: 'app/sale.html',
			controller: 'SaleController'
		})
		.otherwise({
			redirectTo: '/sales'
		});
}]);