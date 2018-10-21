package com.mybossseasonfinal.justthejob.DI.Component

import android.app.Application
import com.mybossseasonfinal.justthejob.DI.Module.ApiModule
import com.mybossseasonfinal.justthejob.DI.Module.AppModule
import com.mybossseasonfinal.justthejob.Services.ApiService
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, ApiModule::class])
interface AppComponent {
    fun application(): Application
    fun apiService(): ApiService
}