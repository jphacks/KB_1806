package com.mybossseasonfinal.justthejob.Services

import com.mybossseasonfinal.justthejob.Models.Company
import com.mybossseasonfinal.justthejob.Models.User
import com.mybossseasonfinal.justthejob.Models.Worker
import com.mybossseasonfinal.justthejob.Models.UsersCompany
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
    @GET("/company/{company_id}")
    fun getCompany(@Path("company_id") companyId: Int): Single<Company>

    // 指定ユーザのmy企業に新しい企業を追加
    @POST("/users/company")
    fun postUsersCompany(@Body usersCompany: UsersCompany): Completable

    //マッチングしている企業のリストを取得
    @GET("/users/{id}")
    fun getAllCompany(@Path("id") userId: Int): Single<MutableList<Company>>

    //社員情報を取得
    @GET("/company/{id}/employees")
    fun getWorkers(@Path("id") companyId: Int): Single<MutableList<Worker>>
}