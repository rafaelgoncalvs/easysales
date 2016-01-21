(function(){

	var app = angular.module('easySales', []);

	app.controller('ListSaleController', function($scope, $http) {
		$http.get('http://localhost:8080/easysales-api/rest/sales').success(function(data) {
			$scope.sales = data;
	    });
	});

	app.controller('SaleController', function($scope, $http) {
		this.product = {};
		this.products = [];

		this.addSale = function() {
			var saleJson = { 
				date: $scope.sale.date,
				client: $scope.sale.client,
				products: this.products
			}

			var request = {
				method: 'POST',
				url: 'http://localhost:8080/easysales-api/rest/sales',
				headers: {},
				data: saleJson
			}

			$http(request).then(function successCallback(response) {
    			$scope.sales.unshift(saleJson);
    			$scope.sale = {};
  			}, function errorCallback(response) {
  				console.log('erro');
  			});
  			this.products = [];
		};
		
		this.addProduct = function() {
			this.products.unshift(this.product);
			this.product = {};
		};
	});

	app.controller('PaymentController', function($scope, $http) {
		this.payment = {};
		this.addPayment = function(sale) {
			sale.payments.unshift(this.payment);
			this.payment = {};
		};
	});

})();