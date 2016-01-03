(function(){

	var app = angular.module('easySales', []);

	app.controller('ListSaleController', function($scope, $http) {
		$http.get('http://localhost:8080/easysales-api/rest/sale').success(function(data) {
			$scope.sales = data;
	    });
		this.sales = salesTemp;
	});

	app.controller('SaleController', function($scope) {
		this.sale = {
			client: '',
			date: '',
			value: 0.0,
			products: []
		};
		this.addSale = function() {
			salesTemp.unshift(this.sale);
			this.sale = {
				client: '',
				date: '',
				value: 0.0,
				products: []
			};
		};

		this.product = {};
		this.addProduct = function() {
			console.log(this.product);
			console.log(this.sale);
			this.sale.products.push(this.product);
			this.product = {};
		};
	});

	var salesTemp = [
		{
			client: 'Rafael dos Santos Gonçalves',
			date: '31/12/2015',
			value: 259.56,
			products: [
				{
					name: 'Calça jeans azul',
					value: 130.00
				},
				{
					name: 'Blusa vermelha',
					value: 70.00
				},
				{
					name: 'Cinto Armani',
					value: 9.56
				}
			]
		}, 
		{
			client: 'Nathalia Fernanda de Estefano Mazali Alves',
			date: '10/11/2015',
			value: 32.10,
			products: [
				{
					name: 'Meia fina preta',
					value: 32.10
				}
			]
		}, 
		{
			client: 'Maria Aparecida de Souza',
			date: '09/10/2015',
			value: 1050.00,
			products: [
				{
					name: 'Calça jeans azul com barra',
					value: 200.00
				},
				{
					name: 'Calça social preta',
					value: 500.00
				},
				{
					name: 'Blusa vermelha',
					value: 100.00
				},
				{
					name: 'Blusa azul',
					value: 100.00
				},
				{
					name: 'Blusa amarela',
					value: 150.00
				}
			]
		}
	];

})();