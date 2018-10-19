var express = require('express');
var router = express.Router();
var MongoClient = require("mongodb").MongoClient;
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

//学生が登録した企業一覧をリストで送信
router.get('/:userID', function(req, res, next) {
    getCompanyList(req.params.userID,"company", "users_company", res);
});

//学生が登録した企業をデータベースに保存
router.post('/:userID/company/:company_id', function(req, res, next) {
    getCompanyList(req.params.userID,"company", "users_company", res);
});

//社員個人情報取得
function getCompanyList(_id, dbName, collection, res){
  // MongoDB へ 接続
  console.log("test");
  var companyList=[];//ユーザが登録した企業名を格納する配列
  MongoClient.connect(url_db, (error, client) => {

    const db = client.db(dbName);
    console.log("test2");
    // コレクションの取得
    collectionUsers = db.collection(collection);

    // コレクション中でユーザIDに合致する企業IDドキュメントを取得
    collectionUsers.find({user_id:Number(_id)}).toArray((error, documents)=>{
        if(documents[0] != null){
          var count=0;
          for (var document of documents) {
              // コレクション中で企業IDに合致する企業名を取得
              collectionCompany = db.collection("info");
              collectionCompany.find({id:document.company_id}).toArray((error, documents)=>{
                  if(documents[0] != null){
                      companyList.push(documents[0].name);
                      if(documents.length==count){
                        console.log(companyList);
                        res.send(companyList);
                      }
                      count++;
                  }
              });
          }
      }
    });
  });
};
module.exports = router;
