package com.mybossseasonfinal.justthejob.DI.Module

import com.mybossseasonfinal.justthejob.CompanyRegistrationActivity.CompanyRegistrationContract
import com.mybossseasonfinal.justthejob.MainActivity.MainContract
import com.mybossseasonfinal.justthejob.PerActivity
import dagger.Module
import dagger.Provides

@Module
class ActivityModule {
    private lateinit var mainView: MainContract.View
    private lateinit var companyRegistrationView: CompanyRegistrationContract.View

    constructor(mainView: MainContract.View) {
        this.mainView = mainView
    }

    @PerActivity
    @Provides
    fun provideMainContractView(): MainContract.View {
        return mainView
    }

    constructor(companyRegistrationView: CompanyRegistrationContract.View) {
        this.companyRegistrationView = companyRegistrationView
    }

    @PerActivity
    @Provides
    fun provideCompanyRegistrationContractView(): CompanyRegistrationContract.View {
        return companyRegistrationView
    }
}