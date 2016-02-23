var app = require('app');

require('./app.routes.js');
require('./app.config.js');

require('./authenticator/authenticator.controller.js');
require('./sales/sales.controller.js');
require('./sale/sale.controller.js');
require('./payment.controller.js');

require('./session.service.js');
require('./authenticator.service.js');

app.init();