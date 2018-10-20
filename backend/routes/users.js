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
/**
 * @swagger
 * /users/personality:
 *   post:
 *     summary: Watson Personality Insightsでユーザの性格特性を取得
 *     produces:
 *       - application/json
 *     parameters:
 *       - name: user_id
 *         in: formData
 *         required: true
 *         dataType: integer
 *         description: ユーザID
 *       - name: content
 *         in: formData
 *         required: true
 *         dataType: integer
 *         description: Personality Insightsで解析してほしいテキスト※100文字以上
 *     responses:
 *       200:
 *         description: add
 */
// ユーザの性格特性の結果を返すAPI
router.post('/personality', function(req, res, next) {
    postUserPersonality(req.body, res);
});

/**
 * @swagger
 * /users/personality/{user_id}:
 *   get:
 *     summary: Watsonによる性格特性の結果を取得
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
//Watsonによる性格特性の結果を取得
router.get('/personality/:user_id', function(req, res, next) {
    getUserPersonality(req.params.user_id, res);
});

// ユーザとマッチする社員を検索
router.get('/:user_id/matching/:company_id', function(req, res, next) {
    getMatchingrEmployees(req.params.user_id, req.params.company_id, res);
});

// ユーザのMy企業に指定企業を保存
function postUserCompany(user_id, company_id, res){
    // MongoDB へ 接続
    MongoClient.connect(url_db, (error, client) => {
        const db = client.db('company');

        // コレクションの取得
        collection = db.collection('users_company');
        collection.insertOne({
            'user_id': Number(user_id),
            'company_id': Number(company_id)

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
// Watsonによる性格特性の結果をデータに格納
function postUserPersonality(body, res){
  personalityInsights.profile(
    {
      content: body.content,
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
            collection.find({user_id: Number(body.user_id)}).toArray((error, documents)=>{
                if(documents[0] != null){
                  // 条件に合致するドキュメントをすべて更新
                  collection.updateMany(
                    { user_id: Number(body.user_id) },
                    { $set: {
                      'personality_insights': response
                     } },
                    (error, result) => {
                        client.close();
                    });
                }
                else{
                  //新規登録
                  collection.insertOne({
                      'user_id': Number(body.user_id),
                      'personality_insights': response

                  }, (error, result) => {
                      client.close();
                  });
                }
            });
        });
      }
    }
  );
};
//ユーザの性格特性を取得
function getUserPersonality(_id, res){
  // MongoDB へ 接続
  MongoClient.connect(url_db, (error, client) => {
    const db = client.db("users");

    // コレクションの取得
    collection = db.collection("Personality_Insights");

    // コレクション中で会社IDに合致するドキュメントを取得
    collection.find({user_id:Number(_id)}).toArray((error, documents)=>{
        if(documents[0] != null)res.json(documents[0]);
        else res.send("error:id not found");
    });
  });
};

//ユーザとマッチする社員を検索
function getMatchingrEmployees(_user_id,_company_id, res){
  var matchingRate=[];
  var count=0;
  // MongoDB へ 接続
  MongoClient.connect(url_db, (error, client) => {
    const dbUsers = client.db('users');
    // コレクションの取得
    collectionPerIns = dbUsers.collection('Personality_Insights');
    // ユーザの性格特性情報を取得
    collectionPerIns.find({user_id:Number(_user_id)}).toArray((error, userIns)=>{
        console.log(userIns[0].user_id,userIns[0].personality_insights.personality[0].percentile,userIns[0].personality_insights.personality[1].percentile);

        const db = client.db('company');

        // コレクションの取得
        collectionEmp = db.collection('employees');
        // コレクション中でユーザが登録している会社の社員情報一覧を取得
        collectionEmp.find({company_id:Number(_company_id)}).toArray((error, documentsEmp)=>{
          for (var j = 0 ; j < documentsEmp.length ; j++) {
            console.log(documentsEmp[j].id,documentsEmp[j].name,documentsEmp[j].company_id);

            // ユーザが登録している企業の社員の性格特性情報を取得
            collectionEmpIns = db.collection('employees_insights');
            collectionEmpIns.find({employee_id:Number(documentsEmp[j].id)}).toArray((error, employeeIns)=>{
                if(employeeIns[0] != null){
                  console.log("employeeIns",employeeIns[0].employee_id,employeeIns[0].personality_insights.personality[0].percentile,employeeIns[0].personality_insights.personality[1].percentile);
                  var sumRate=0;
                  for(var i = 0; i<employeeIns[0].personality_insights.personality.length; i++){
                    sumRate += Math.abs(employeeIns[0].personality_insights.personality[i].percentile - userIns[0].personality_insights.personality[i].percentile);
                    console.log("sumRate",sumRate);
                  }
                  matchingRate.push({
                    "employee_id":employeeIns[0].employee_id,
                    "matching_rate":(employeeIns[0].personality_insights.personality.length - sumRate)/employeeIns[0].personality_insights.personality.length
                  });
                }

                if(j == documentsEmp.length){
                  count++;
                  if(count == documentsEmp.length){
                    //マッチング度でソートし一番マッチしている社員を返す
                    var sortedMatchingRate = matchingRate.sort(compare);
                    console.log("matchingRate",sortedMatchingRate);
                    res.json(sortedMatchingRate[0]);
                  }
                }
            });

          }
        });
     });
  });
};
//. 比較関数
function compare( a, b ){
  var r = 0;
  if( a.matching_rate > b.matching_rate ){ r = -1; }
  else if( a.matching_rate < b.matching_rate ){ r = 1; }

  return r;
}
module.exports = router;
