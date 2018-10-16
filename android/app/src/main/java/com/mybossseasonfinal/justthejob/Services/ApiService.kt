package com.mybossseasonfinal.justthejob.Services

import com.mybossseasonfinal.justthejob.Models.User
import io.reactivex.Completable
import io.reactivex.Single
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST

interface ApiService {
    @Headers("Content-type: application/json")
    //GETリクエスト
    @GET("1cuu41x1")
    fun getUsers(): Single<List<User>>


    //POSTリクエスト
    @POST("1cuu41x1")
    fun post(@Body user: User): Completable
    // 他に API があればここに並べる
}