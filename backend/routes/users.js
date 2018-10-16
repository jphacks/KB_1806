var express = require('express');
var router = express.Router();

/**
 * @swagger
 * /users:
 *   get:
 *     description: get all users
 *     produces:
 *       - application/json
 *     responses:
 *       200:
 *         description: login
 */
router.get('/', function(req, res, next) {
    let users = [
        {
            'name': '太郎'
        },
        {
            'name': '花子'
        },
    ];
    res.json(users);
});

/**
 * @swagger
 * /users/login:
 *   post:
 *     description: Login to the application
 *     produces:
 *       - application/json
 *     parameters:
 *       - name: username
 *         description: Username to use for login.
 *         in: formData
 *         required: true
 *         type: string
 *       - name: password
 *         description: User's password.
 *         in: formData
 *         required: true
 *         type: string
 *     responses:
 *       200:
 *         description: login
 */
router.post('/login', function(req, res) {
    res.json(req.body);
});

module.exports = router;
