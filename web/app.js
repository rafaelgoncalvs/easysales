(function(){

	var app = angular.module('easySales', []);

	app.controller('SaleController', function() {		
		this.sales = salesTemp;
	});

	var salesTemp = [
		{
			client: 'Rafael',
			date: '31/12/2015',
			value: 259.56
		}, 
		{
			client: 'Nathalia',
			date: '10/11/2015',
			value: 32.00
		}, 
		{
			client: 'Maria',
			date: '09/10/2015',
			value: 1230.00
		}
	];

})();