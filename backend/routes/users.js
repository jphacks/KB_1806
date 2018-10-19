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

//社員個人を送信
router.post('/:user_id/company/:company_id', function(req, res, next) {
    postUserCompany(req.params.user_id, req.params.company_id, "company", "users_company", res);
});

function postUserCompany(user_id, company_id, dbName, collection, res){
    // MongoDB へ 接続
    MongoClient.connect(url_db, (error, client) => {
        const db = client.db(dbName);

        // コレクションの取得
        collection = db.collection(collection);
        collection.insert({user_id:Number(user_id), company_id:Number(company_id)}).toArray((error, documents)=>{
            if(documents[0] != null) res.json(documents[0]);
            else res.send("error:id not found");
        });
    });
};


module.exports = router;
