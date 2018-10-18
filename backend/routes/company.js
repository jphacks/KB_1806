var express = require('express');
var router = express.Router();
var MongoClient = require("mongodb").MongoClient;
var assert = require('assert')
var url_db = 'mongodb://localhost:27017/company'
/**
  * @swagger
  * definitions:
  *   LoginCompany:
  *     type: object
  *     description: 会社情報
  *     required:
  *       - name
  *       - password
  *     properties:
  *       name:
  *         type: string
  *         description: 会社名
  *       password:
  *         type: string
  *         format: password
  *         description: パスワード
  */

/**
  * @swagger
  * parameter:
  *   companyIdPathParam:
  *     in: path
  *     name: id
  *     description: 企業ID
  *     required: true
  *     type: integer
  *     format: int32
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
  *       - $ref: '#/parameters/companyIdPathParam'
  *     responses:
  *       200:
  *         description: 取得成功
  *         schema:
  *           allOf:
  *             - $ref: '#/definitions/LoginCompany'
  *             - properties:
  *                 id:
  *                   type: integer
  *                   description: 企業ID
  *       404:
  *         description: 該当データ無し
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
