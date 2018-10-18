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
  * /company/{id}:
  *   get:
  *     tags:
  *       - company
  *     summary: 企業情報取得
  *     description: 指定された企業の情報を取得する。
  *     parameters:
  *       -  name: "id"
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

router.get('/:id', function(req, res, next) {
    //res.send("id:" + req.params.id);
    getCompanyInfo(req.params.id, res);
});

//会社情報取得
function getCompanyInfo(_id, res){
  // MongoDB へ 接続
  MongoClient.connect(url_db, (error, client) => {
    const db = client.db('company');

    // コレクションの取得
    collection = db.collection("info");

    // コレクション中で会社IDに合致するドキュメントを取得
    collection.find({id:Number(_id)}).toArray((error, documents)=>{
        if(documents[0] != null)res.json(documents);
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
        "address": "東京都新宿区西早稲田１－６－１"
    }, (error, result) => {
        client.close();
    });
});
*/
module.exports = router;
