package com.mybossseasonfinal.justthejob.Services

import com.mybossseasonfinal.justthejob.Models.*
import io.reactivex.Completable
import io.reactivex.Single
import retrofit2.http.*

interface ApiService {
    @Headers("Content-type: application/json")
    //GETリクエスト
    @GET("1cuu41x1")
    fun getUsers(): Single<List<User>>

    //POSTリクエスト
    @FormUrlEncoded
    @POST("/users/personality")
    fun postEntrySheet(@Field("user_id") userId: Int, @Field("content") content: String): Completable

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

    //社員情報を取得
    @GET("/company/{companyId}/employees/{workerId}")
    fun getWorker(@Path("companyId") companyId: Int, @Path("workerId") workerId: Int): Single<Worker>

    //社員情報を取得
    @GET("/users/{userId}/matching/{companyId}")
    fun getBestMatchWorker(@Path("companyId") companyId: Int, @Path("userId") workerId: Int): Single<MatchingWorker>
}