var app = require("app");

app.controller('AuthenticatorController', function() {
	this.login = function(user) {
		var data = "username=" + usuer.username + "&password=" + user.password;
		console.log(data);
	};
});