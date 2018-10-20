var express = require('express');
var router = express.Router();
var MongoClient = require("mongodb").MongoClient;
var assert = require('assert')
var url_db = 'mongodb://localhost:27017/company'

/**
 * @swagger
 * /company/:
 *   get:
 *     tags:
 *       - company
 *     summary: 会社情報を一覧を取得
 *     produces:
 *       - application/json
 *     responses:
 *       200:
 *         description: login
 */
  //会社情報を一覧を取得
  router.get('/', function(req, res, next) {
      getAllCompanyInfo(res);
  });

  /**
   * @swagger
   * /company/employees/:
   *   get:
   *     tags:
   *       - company
   *     summary: 登録会社すべての社員情報一覧を送信
   *     produces:
   *       - application/json
   *     responses:
   *       200:
   *         description: login
   */
  //登録会社すべての社員情報一覧を送信
  router.get('/employees/', function(req, res, next) {
      getAllEmployeesInfo(res);
  });

/**
  * @swagger
  * /company/{company_id}:
  *   get:
  *     tags:
  *       - company
  *     summary: 企業情報取得
  *     description: 指定された企業の情報を取得する。
  *     parameters:
  *       -  name: "company_id"
  *          in: "path"
  *          description: 取得したい企業のID
  *          required: true
  *          type: integer
  *          format: int32
  *     responses:
  *       200:
  *         description: 成功時のレスポンス
  *         schema:
  *           type: object
  *           description: 会社情報
  *           properties:
  *             _id:
  *               type: integer
  *               example: 5bc8100cc57a3f116ce0e157
  *               description: DB登録時のID
  *             id:
  *               type: integer
  *               format: int32
  *               example: 1
  *               description: 企業ID
  *             name:
  *               type: string
  *               example: 同志社大学
  *               description: 企業名
  *             founder:
  *               type: string
  *               example: 新島襄
  *               description: 創設者
  *             founding:
  *               type: string
  *               example: s23/03/25
  *               description: 創立年月日
  *             address:
  *               type: string
  *               example: 京都府京都市上京区今出川通烏丸東入玄武町６０１
  *               description: 住所
  *       404:
  *         description: 失敗時のレスポンス
  *         schema:
  *           type: string
  */

//会社情報を送信
router.get('/:id', function(req, res, next) {
    //res.send("id:" + req.params.id);
    getCompanyInfo(req.params.id,"company", "info", res);
});


/**
  * @swagger
  * /company/{company_id}/employees:
  *   get:
  *     tags:
  *       - company
  *     summary: 社員情報取得
  *     description: 企業に所属する全社員の情報を取得する。
  *     parameters:
  *       -  name: "company_id"
  *          in: "path"
  *          description: 社員情報を取得したい企業のID
  *          required: true
  *          type: integer
  *          format: int32
  *     responses:
  *       200:
  *         description: 成功時のレスポンス
  *         schema:
  *           type: object
  *           description: 社員情報
  *           properties:
  *             _id:
  *               type: integer
  *               example: 5bc8100cc57a3f116ce0e157
  *               description: DB登録時のID
  *             id:
  *               type: integer
  *               format: int32
  *               example: 1
  *               description: 社員ID
  *             company_id:
  *               type: integer
  *               format: int32
  *               example: 1
  *               description: 企業ID
  *             name:
  *               type: string
  *               example: 同志社太郎
  *               description: 名前
  *             age:
  *               type: integer
  *               format: int32
  *               example: 30
  *               description: 年齢
  *             position:
  *               type: string
  *               example: 理工学研究科情報工学専攻
  *               description: 所属
  *             join_company:
  *               type: integer
  *               format: int32
  *               example: 2018
  *               description: 入社年
  *             working_length:
  *               type: integer
  *               format: int32
  *               example: 6
  *               description: 勤務年数
  *             self_introduction:
  *               type: string
  *               example: よろしくお願いします．
  *               description: 自己紹介
  *             business_outline:
  *               type: string
  *               example: Webページの設計
  *               description: 業務内容
  *             holiday:
  *               type: string
  *               example: 映画鑑賞しています．
  *               description: 休日の過ごし方
  *             img_path:
  *               type: string
  *               example: https://s3-ap-northeast-1.amazonaws.com/jphacks2018.images/doshisha_logo.jpg
  *               description: ロゴの保存先のURL
  *       404:
  *         description: 失敗時のレスポンス
  *         schema:
  *           type: string
  */
//社員一覧を送信
router.get('/:id/employees', function(req, res, next) {
    getAllEmployeeInfo(req.params.id,"company", "employees", res);
});
/**
  * @swagger
  * /company/{company_id}/employees/{employees_id}:
  *   get:
  *     tags:
  *       - company
  *     summary: 社員個人の情報取得
  *     description: 社員個人の情報を取得する。
  *     parameters:
  *       -  name: "company_id"
  *          in: "path"
  *          description: 会社のID
  *          required: true
  *          type: integer
  *          format: int32
  *       -  name: "employees_id"
  *          in: "path"
  *          description: 個人のID
  *          required: true
  *          type: integer
  *          format: int32
  *     responses:
  *       200:
  *         description: 成功時のレスポンス
  *         schema:
  *           type: object
  *           description: 社員情報
  *           properties:
  *             _id:
  *               type: integer
  *               example: 5bc8100cc57a3f116ce0e157
  *               description: DB登録時のID
  *             id:
  *               type: integer
  *               format: int32
  *               example: 1
  *               description: 社員ID
  *             company_id:
  *               type: integer
  *               format: int32
  *               example: 1
  *               description: 企業ID
  *             name:
  *               type: string
  *               example: 同志社太郎
  *               description: 名前
  *             age:
  *               type: integer
  *               format: int32
  *               example: 30
  *               description: 年齢
  *             position:
  *               type: string
  *               example: 理工学研究科情報工学専攻
  *               description: 所属
  *             join_company:
  *               type: integer
  *               format: int32
  *               example: 2018
  *               description: 入社年
  *             working_length:
  *               type: integer
  *               format: int32
  *               example: 6
  *               description: 勤務年数
  *             self_introduction:
  *               type: string
  *               example: よろしくお願いします．
  *               description: 自己紹介
  *             business_outline:
  *               type: string
  *               example: Webページの設計
  *               description: 業務内容
  *             holiday:
  *               type: string
  *               example: 映画鑑賞しています．
  *               description: 休日の過ごし方
  *             img_path:
  *               type: string
  *               example: https://s3-ap-northeast-1.amazonaws.com/jphacks2018.images/doshisha_logo.jpg
  *               description: ロゴの保存先のURL
  *       404:
  *         description: 失敗時のレスポンス
  *         schema:
  *           type: string
  */
//社員個人を送信
router.get('/:id/employees/:emp_id', function(req, res, next) {
    getEnployeeInfo(req.params.id,req.params.emp_id,"company", "employees", res);
});

/**
 * @swagger
 * /company/setEmployee:
 *   post:
 *     tags:
 *       - company
 *     summary: データベースに社員情報を登録
 *     produces:
 *       - application/json
 *     parameters:
 *            -  name: id
 *               in: formData
 *               type: integer
 *               format: int32
 *               example: 1
 *               description: 社員ID
 *            -  name: company_id
 *               in: formData
 *               type: integer
 *               format: int32
 *               example: 1
 *               description: 企業ID
 *            -  name: name
 *               in: formData
 *               type: string
 *               example: 同志社太郎
 *               description: 名前
 *            -  name: age
 *               in: formData
 *               type: integer
 *               format: int32
 *               example: 30
 *               description: 年齢
 *            -  name: position
 *               in: formData
 *               type: string
 *               example: 理工学研究科情報工学専攻
 *               description: 所属
 *            -  name: join_company
 *               in: formData
 *               type: integer
 *               format: int32
 *               example: 2018
 *               description: 入社年
 *            -  name: working_length
 *               in: formData
 *               type: integer
 *               format: int32
 *               example: 6
 *               description: 勤務年数
 *            -  name: self_introduction
 *               in: formData
 *               type: string
 *               example: よろしくお願いします．
 *               description: 自己紹介
 *            -  name: business_outline
 *               in: formData
 *               type: string
 *               example: Webページの設計
 *               description: 業務内容
 *            -  name: holiday
 *               in: formData
 *               type: string
 *               example: 映画鑑賞しています．
 *               description: 休日の過ごし方
 *            -  name: img_path
 *               in: formData
 *               type: string
 *               example: https://s3-ap-northeast-1.amazonaws.com/jphacks2018.images/doshisha_logo.jpg
 *               description: ロゴの保存先のURL
 *     responses:
 *       200:
 *         description: add
 */

//データベースに社員情報を登録
router.post('/setEmployee', function(req, res, next) {
    postSetEmployee(req.body, res);
});

/**
 * @swagger
 * /company/setCompany:
 *   post:
 *     tags:
 *       - company
 *     summary: データベースに企業情報を登録
 *     produces:
 *       - application/json
 *     parameters:
 *            -  name: company_id
 *               type: integer
 *               format: int32
 *               in: formData
 *               example: 1
 *               description: 企業ID
 *            -  name: name
 *               in: formData
 *               example: 同志社大学
 *               description: 企業名
 *            -  name: founder
 *               in: formData
 *               example: 新島襄
 *               description: 創設者
 *            -  name: founding
 *               in: formData
 *               example: s23/03/25
 *               description: 創立年月日
 *            -  name: address
 *               in: formData
 *               example: 京都府京都市上京区今出川通烏丸東入玄武町６０１
 *               description: 住所
 *            -  name: img_path
 *               in: formData
 *               example: https://s3-ap-northeast-1.amazonaws.com/jphacks2018.images/doshisha_logo.jpg
 *               description: ロゴの保存先のURL
 *     responses:
 *       200:
 *         description: add
 */
//データベースに企業情報を登録
router.post('/setCompany', function(req, res, next) {
    postSetCompany(req.body, res);
});

//会社情報一覧
function getAllCompanyInfo(res){
  // MongoDB へ 接続
  MongoClient.connect(url_db, (error, client) => {
    const db = client.db("company");

    // コレクションの取得
    collection = db.collection("info");

    // コレクション中で会社IDに合致するドキュメントを取得
    collection.find().toArray((error, documents)=>{
        if(documents[0] != null)res.json(documents);
        else res.send("error:該当データがありません");
    });
  });
};
//全会社の社員情報一覧
function getAllEmployeesInfo(res){
  // MongoDB へ 接続
  MongoClient.connect(url_db, (error, client) => {
    const db = client.db("company");

    // コレクションの取得
    collection = db.collection("employees");

    // コレクション中で会社IDに合致するドキュメントを取得
    collection.find().toArray((error, documents)=>{
        if(documents[0] != null)res.json(documents);
        else res.send("error:該当データがありません");
    });
  });
};
//会社情報取得
function getCompanyInfo(_id, dbName, collection, res){
  // MongoDB へ 接続
  MongoClient.connect(url_db, (error, client) => {
    const db = client.db(dbName);

    // コレクションの取得
    collection = db.collection(collection);

    // コレクション中で会社IDに合致するドキュメントを取得
    collection.find({id:Number(_id)}).toArray((error, documents)=>{
        if(documents[0] != null)res.json(documents[0]);
        else res.send("error:id not found");
    });
  });
};
//全社員情報取得
function getAllEmployeeInfo(_id,dbName, collection, res){
  // MongoDB へ 接続
  MongoClient.connect(url_db, (error, client) => {
    const db = client.db(dbName);

    // コレクションの取得
    collection = db.collection(collection);

    // コレクション中で会社IDに合致するドキュメントを取得
    collection.find({company_id:Number(_id)}).toArray((error, documents)=>{
        if(documents[0] != null)res.json(documents);
        else res.send("error:id not found");
    });
  });
};

//社員個人情報取得
function getEnployeeInfo(_id, emp_id,dbName, collection, res){
  // MongoDB へ 接続
  MongoClient.connect(url_db, (error, client) => {
    const db = client.db(dbName);

    // コレクションの取得
    collection = db.collection(collection);

    // コレクション中で会社IDに合致するドキュメントを取得
    collection.find({company_id:Number(_id),id:Number(emp_id)}).toArray((error, documents)=>{
        if(documents[0] != null)res.json(documents[0]);
        else res.send("error:id not found");
    });
  });
};

//企業情報をデータベースに登録
function postSetCompany(body, res){
    // MongoDB へ 接続
    MongoClient.connect(url_db, (error, client) => {
        const db = client.db('company');

        // コレクションの取得
        collection = db.collection('info');


        collection.find({id: Number(body.id)}).toArray((error, documents)=>{
            if(documents[0] != null){
              // 条件に合致するドキュメントをすべて更新
              collection.updateMany(
                  { id: Number(body.id) },
                  { $set: {
                    "name": body.name,
                    "founder": body.founder,
                    "founding": body.founding,
                    "address": body.address,
                    "img_path":body.img_path
                   } },
                  (error, result) => {
                      client.close();
                  });
            }
            else{
              //新規登録
              collection.insertOne({
                  "id": Number(body.id),
                  "name": body.name,
                  "founder": body.founder,
                  "founding": body.founding,
                  "address": body.address,
                  "img_path":body.img_path

              }, (error, result) => {
                  client.close();
              });
            }
            res.json({
                "id": body.id,
                "name": body.name,
                "founder": body.founder,
                "founding": body.founding,
                "address": body.address,
                "img_path":body.img_path
            });
        });
    });
};
//社員情報をデータベースに登録
function postSetEmployee(body, res){
    // MongoDB へ 接続
    MongoClient.connect(url_db, (error, client) => {
        const db = client.db('company');

        // コレクションの取得
        collection = db.collection('employees');
        collection.find({id: Number(body.id)}).toArray((error, documents)=>{
            if(documents[0] != null){
              //社員情報更新
              collection.updateMany(
                  { id: Number(body.id) },
                  { $set: {
                    "name": body.name,
                    "company_id": Number(body.company_id),
                    "age": Number(body.age),
                    "position": body.position,
                    "join_company": Number(body.join_company),
                    "working_length": Number(body.working_length),
                    "self_introduction": body.self_introduction,
                    "business_outline": body.business_outline,
                    "holiday": body.holiday,
                    "img_path":body.img_path
                   } },
                   (error, result) => {
                      client.close();
                  });
            }
            else{
              //新規社員登録
                collection.insertOne({
                    "id": Number(body.id),
                    "name": body.name,
                    "company_id": Number(body.company_id),
                    "age": Number(body.age),
                    "position": body.position,
                    "join_company": Number(body.join_company),
                    "working_length": Number(body.working_length),
                    "self_introduction": body.self_introduction,
                    "business_outline": body.business_outline,
                    "holiday": body.holiday,
                    "img_path":body.img_path
                }, (error, result) => {
                    client.close();
                });
            }
          res.json({
            "id": Number(body.id),
            "name": body.name,
            "company_id": Number(body.company_id),
            "age": Number(body.age),
            "position": body.position,
            "join_company": Number(body.join_company),
            "working_length": Number(body.working_length),
            "self_introduction": body.self_introduction,
            "business_outline": body.business_outline,
            "holiday": body.holiday,
            "img_path":body.img_path
          });
        });
    });
};

module.exports = router;
