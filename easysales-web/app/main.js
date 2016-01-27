var app = require('app');

require('./app.routes');

require('./sales.controller.js');
require('./sale.controller.js');
require('./payment.controller.js');

app.init();