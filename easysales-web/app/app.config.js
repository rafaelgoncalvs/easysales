var app = require('app');

app.config(function($httpProvider) {
    $httpProvider.interceptors.push('authenticatorInterceptor');
});