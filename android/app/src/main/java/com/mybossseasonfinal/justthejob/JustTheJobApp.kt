package com.mybossseasonfinal.justthejob

import android.app.Application
import com.mybossseasonfinal.justthejob.DI.Component.AppComponent
import com.mybossseasonfinal.justthejob.DI.Component.DaggerAppComponent
import com.mybossseasonfinal.justthejob.DI.Module.ApiModule
import com.mybossseasonfinal.justthejob.DI.Module.AppModule

class JustTheJobApp : Application() {
    private lateinit var appComponent: AppComponent

    fun getComponent(): AppComponent {
        return appComponent
    }

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.builder()
                .appModule(AppModule(this))
                .apiModule(ApiModule())
                .build()
    }
}