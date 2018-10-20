var express = require('express');
var router = express.Router();

/**
 * @swagger
 * /:
 *   get:
 *     description: index page
 *     produces:
 *       - application/json
 *     responses:
 *       200:
 *         description: index
 */
router.get('/', function(req, res, next) {
    let response = { "message": "index"};
    res.header('Content-Type', 'application/json; charset=utf-8')
    res.json(response);
});

module.exports = router;
