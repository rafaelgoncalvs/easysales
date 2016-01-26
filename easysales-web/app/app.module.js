var angular = require('angular');

var app = angular.module('app', []);

app.init = function() {
  angular.bootstrap(document, ['app']);
};

module.exports = app;