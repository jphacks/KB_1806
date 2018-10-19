var express = require('express');
var router = express.Router();
var MongoClient = require("mongodb").MongoClient;
var assert = require('assert')
var url_db = 'mongodb://localhost:27017/company'

/**
  * @swagger
  * schemes:
  *   - http
  */
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
  *             imp_path:
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
    getAllEmproyeeInfo(req.params.id,"company", "employees", res);
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
    getEnproyeeInfo(req.params.id,req.params.emp_id,"company", "employees", res);
});



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
function getAllEmproyeeInfo(_id,dbName, collection, res){
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
function getEnproyeeInfo(_id, emp_id,dbName, collection, res){
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


// MongoDB へ 接続
/*MongoClient.connect(url_db, (error, client) => {
    var collection;
    const db = client.db('company');

    // コレクションの取得
    collection = db.collection("info");

    // コレクションにドキュメントを挿入
    collection.insertOne({
        "id": 2,
        "name": "早稲田大学",
        "founder": "大隈重信",
        "founding": "s24/02/21",
        "address": "東京都新宿区西早稲田１－６－１",
        "img_path":"https://s3-ap-northeast-1.amazonaws.com/jphacks2018.images/akanda_prof.jpg"

    }, (error, result) => {
        client.close();
    });
});
*/
/*MongoClient.connect(url_db, (error, client) => {
    var collection;
    const db = client.db('company');

    // コレクションの取得
    collection = db.collection("employees");

    // コレクションにドキュメントを挿入
    collection.insertOne({
        "id": 2,
        "name": "神田章博",
        "company_id": 1,
        "age": 23,
        "position": "理工学研究科情報工学専攻",
        "join_company": 2018,
        "working_length": 1,
        "self_introduction": "時代屋でバイトしてます．よろしくお願いします．",
        "business_outline": "知的照明システムの研究開発を行っています",
        "holiday": "海外ドラマ（ウォーキングデッド）を見てます．",
        "img_path":"https://s3-ap-northeast-1.amazonaws.com/jphacks2018.images/akanda_prof.jpg"
    }, (error, result) => {
        client.close();
    });
});
*/
module.exports = router;
