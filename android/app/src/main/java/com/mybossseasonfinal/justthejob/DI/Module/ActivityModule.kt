package com.mybossseasonfinal.justthejob.DI.Module

import com.mybossseasonfinal.justthejob.MainActivity.MainContract
import com.mybossseasonfinal.justthejob.PerActivity
import dagger.Module
import dagger.Provides

@Module
class ActivityModule {
    private var mainView: MainContract.View

    constructor(mainView: MainContract.View) {
        this.mainView = mainView
    }

    @PerActivity
    @Provides
    fun provideMainContractView(): MainContract.View {
        return mainView
    }
}