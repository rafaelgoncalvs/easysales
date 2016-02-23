var app = require('app');

app.factory('session', function($window) {
	var service = {};

	service.put = function(key, value) {
		$window.sessionStorage.setItem(key, value);
	};

	service.remove = function(key){
		$window.sessionStorage.removeItem(key);
	};

	service.get = function(key) {
		return $window.sessionStorage.getItem(key);
	};

	return service;
});