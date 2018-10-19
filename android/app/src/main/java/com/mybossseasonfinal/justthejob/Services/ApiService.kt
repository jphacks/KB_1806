package com.mybossseasonfinal.justthejob.Services

import com.mybossseasonfinal.justthejob.Models.Company
import com.mybossseasonfinal.justthejob.Models.User
import com.mybossseasonfinal.justthejob.Models.Worker
import io.reactivex.Completable
import io.reactivex.Single
import retrofit2.http.*

interface ApiService {
    @Headers("Content-type: application/json")
    //GETリクエスト
    @GET("1cuu41x1")
    fun getUsers(): Single<List<User>>

    //POSTリクエスト
    @POST("1cuu41x1")
    fun post(@Body user: User): Completable

    // 指定IDの企業情報を取得
    @GET("/company/{id}")
    fun getCompany(@Path("id") CompanyId: Int): Single<Company>

    //マッチングしている企業のリストを取得
    @GET("/users/{id}")
    fun getAllCompany(@Path("id") userId: Int): Single<MutableList<Company>>

    //社員情報を取得
    @GET("/company/{id}/employees")
    fun getWorkers(@Path("id") companyId: Int): Single<MutableList<Worker>>
}