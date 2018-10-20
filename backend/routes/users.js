var express = require('express');
var router = express.Router();
var MongoClient = require("mongodb").MongoClient;
var url_db = 'mongodb://localhost:27017/company'
var PersonalityInsightsV3 = require('watson-developer-cloud/personality-insights/v3');
//watson personalityInsights Authentication
var personalityInsights = new PersonalityInsightsV3({
  username: '0f304f75-c6ff-44d2-9e02-8ad625f0f14b',
  password: 'qpuQkhIbhTsy',
  version: '2016-10-19',
  url: 'https://gateway.watsonplatform.net/personality-insights/api'
});

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
 * /users/{user_id}:
 *   get:
 *     summary: 学生が登録した企業一覧を返すAPI
 *     produces:
 *       - application/json
 *     parameters:
 *       - name: user_id
 *         in: path
 *         required: true
 *         format: int32
 *     responses:
 *       200:
 */
//学生が登録した企業一覧をリストで送信
router.get('/:userID', function(req, res, next) {
    getCompanyList(req.params.userID,"company", "users_company", res);
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

// ユーザの性格特性の結果を返すAPI
router.post('/personality/:user_id', function(req, res, next) {
    postUserUserPersonality(req.params.user_id, req.body.content, res);
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

//ユーザが登録した企業一覧を返す関数
function getCompanyList(_id, dbName, collection, res){
  // MongoDB へ 接続
  var companyList=[];//ユーザが登録した企業名を格納する配列
  MongoClient.connect(url_db, (error, client) => {

    const db = client.db(dbName);
    // コレクションの取得
    collectionUsers = db.collection(collection);

    // コレクション中でユーザIDに合致する企業IDドキュメントを取得
    collectionUsers.find({user_id:Number(_id)}).toArray((error, documents)=>{
        if(documents[0] != null){
          var count=1;
          for (var document of documents) {
              // コレクション中で企業IDに合致する企業名を取得
              collectionCompany = db.collection("info");
              collectionCompany.find({id:document.company_id}).toArray((error, documentsCmp)=>{
                  if(documentsCmp[0] != null){
                      companyList.push(documentsCmp[0]);
                      if(documents.length==count){
                        console.log(companyList);
                        res.json(companyList);
                      }
                      count++;
                  }
              });
          }
      }
      else res.send("error:このユーザは企業を登録していない，または存在しないユーザです");
    });
  });
};
// ユーザのMy企業に指定企業を保存
function postUserUserPersonality(user_id, _content, res){
  personalityInsights.profile(
    {
      content: _content,
      content_type: 'text/plain',
      consumption_preferences: true,
      content_language:'ja'
    },
    function(err, response) {
      if (err) {
        console.log('error:', err);
      } else {
        console.log(JSON.stringify(response, null, 2));
        res.json(response);

        // MongoDB へ Personality_Insightsの結果を格納
        MongoClient.connect(url_db, (error, client) => {
            const db = client.db('users');

            // コレクションの取得
            collection = db.collection('Personality_Insights');
            collection.insertOne({
                'user_id': Number(user_id),
                'personality_insights': response

            }, (error, result) => {
                client.close();
            });
        });
      }
    }
  );
};

module.exports = router;
