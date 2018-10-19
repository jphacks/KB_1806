package com.mybossseasonfinal.justthejob.DI.Module

import com.mybossseasonfinal.justthejob.Services.ApiService
import com.squareup.moshi.Moshi
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
class ApiModule {
    @Singleton
    @Provides
    fun provideOkHttpClient(): OkHttpClient {
        return OkHttpClient.Builder().build()
    }

    @Singleton
    @Provides
    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
        val moshi: Moshi = Moshi.Builder().build()

        return Retrofit.Builder()
//                .baseUrl("http://119.228.76.176:62455/api/") // ここのURLは立てるサーバURL
//                .baseUrl("https://radiant-reaches-45097.herokuapp.com/") // ここのURLは立てるサーバURL
                .baseUrl("http://ec2-54-238-143-217.ap-northeast-1.compute.amazonaws.com:3000/") // ここのURLは立てるサーバURL
                .client(okHttpClient)
                .addConverterFactory(MoshiConverterFactory.create(moshi))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()
    }

    @Singleton
    @Provides
    fun provideApiService(retrofit: Retrofit): ApiService {
        return retrofit.create<ApiService>(ApiService::class.java)
    }
}