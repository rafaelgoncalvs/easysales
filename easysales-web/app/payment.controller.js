var app = require('app');

app.controller('PaymentController', function($scope, $http) {
	this.payment = {};
	this.addPayment = function(sale) {
		sale.payments.unshift(this.payment);
		this.payment = {};
	};
});