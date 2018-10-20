package com.mybossseasonfinal.justthejob.DI.Module

import com.mybossseasonfinal.justthejob.CompanyRegistrationActivity.CompanyRegistrationContract
import com.mybossseasonfinal.justthejob.MainActivity.MainContract
import com.mybossseasonfinal.justthejob.MatchingByEntrySheetCompleteActivity.MatchingByEntrySheetCompleteContract
import com.mybossseasonfinal.justthejob.MatchingRequestCompleteActivity.MatchingRequestCompleteContract
import com.mybossseasonfinal.justthejob.PerActivity
import com.mybossseasonfinal.justthejob.WorkerDetailInfomationActivity.WorkerInfomationDetailContract
import dagger.Module
import dagger.Provides

@Module
class ActivityModule {
    private lateinit var mainView: MainContract.View
    private lateinit var companyRegistrationView: CompanyRegistrationContract.View
    private lateinit var workerInfomationDetailView: WorkerInfomationDetailContract.View
    private lateinit var matchingRequestCompleteView: MatchingRequestCompleteContract.View
    private lateinit var matchingByEntrySheetCompleteView: MatchingByEntrySheetCompleteContract.View

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

    constructor(workerInfomationDetailView: WorkerInfomationDetailContract.View) {
        this.workerInfomationDetailView = workerInfomationDetailView
    }

    @PerActivity
    @Provides
    fun provideWorkerInfomationDetailContractView(): WorkerInfomationDetailContract.View {
        return workerInfomationDetailView
    }

    constructor(matchingRequestCompleteView: MatchingRequestCompleteContract.View) {
        this.matchingRequestCompleteView = matchingRequestCompleteView
    }

    @PerActivity
    @Provides
    fun provideMatchingRequestCompleteView(): MatchingRequestCompleteContract.View {
        return matchingRequestCompleteView
    }

    constructor(matchingByEntrySheetCompleteView: MatchingByEntrySheetCompleteContract.View) {
        this.matchingByEntrySheetCompleteView = matchingByEntrySheetCompleteView
    }

    @PerActivity
    @Provides
    fun provideMatchingByEntrySheetCompleteView(): MatchingByEntrySheetCompleteContract.View {
        return matchingByEntrySheetCompleteView
    }
}