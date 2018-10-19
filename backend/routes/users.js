var express = require('express');
var router = express.Router();
var MongoClient = require("mongodb").MongoClient;
var assert = require('assert')
var url_db = 'mongodb://localhost:27017/company'

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


/**
 * @swagger
 * /users/company:
 *   post:
 *     produces:
 *       - application/json
 *     parameters:
 *       - name: user_id
 *         in: formData
 *         required: true
 *         dataType: integer
 *       - name: company_id
 *         in: formData
 *         required: true
 *         dataType: integer
 *     responses:
 *       200:
 *         description: add
 */
// ユーザのMy企業に指定企業を追加
router.post('/company', function(req, res, next) {
    postUserCompany(req.body.user_id, req.body.company_id, res);
});

// ユーザのMy企業に指定企業を保存
function postUserCompany(user_id, company_id, res){
    // MongoDB へ 接続
    MongoClient.connect(url_db, (error, client) => {
        const db = client.db('company');

        // コレクションの取得
        collection = db.collection('users_company');
        collection.insertOne({
            'user_id': user_id,
            'company_id': company_id

        }, (error, result) => {
            client.close();
        });
        res.json({
            'user_id': user_id,
            'company_id': company_id
        });
    });
};


module.exports = router;
