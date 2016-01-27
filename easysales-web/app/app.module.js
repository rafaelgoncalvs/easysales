var angular = require('angular');
require('angular-route');

var app = angular.module('app', ['ngRoute']);

app.init = function() {
  angular.bootstrap(document, ['app']);
};

module.exports = app;