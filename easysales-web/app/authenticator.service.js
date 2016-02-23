var app = require('app');

app.factory('authenticatorInterceptor', function($location, $q, session) {
	var interceptor = {};

	interceptor.request = function(config) {
		config.headers = config.headers || {};
		var token = session.get('token');
		config.headers.Authorization = 'Bearer ' + token;
		return config;
	};

	interceptor.responseError = function(rejection) {
		if (rejection.status === 401) {
			var proximaUrl = $location.url();
			$location.path("/login").search({proximaUrl: proximaUrl});
		}

		return $q.reject(rejection);
	};

	return interceptor;
});