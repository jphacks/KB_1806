package com.mybossseasonfinal.justthejob.DI.Component

import com.mybossseasonfinal.justthejob.CompanyRegistrationActivity.CompanyRegistrationActivity
import com.mybossseasonfinal.justthejob.DI.Module.ActivityModule
import com.mybossseasonfinal.justthejob.MainActivity.MainActivity
import com.mybossseasonfinal.justthejob.MatchingByEntrySheetCompleteActivity.MatchingByEntrySheetCompleteActivity
import com.mybossseasonfinal.justthejob.MatchingRequestCompleteActivity.MatchingRequestCompleteActivity
import com.mybossseasonfinal.justthejob.PerActivity
import com.mybossseasonfinal.justthejob.WorkerDetailInfomationActivity.WorkerInfomationDetailActivity
import dagger.Component

@PerActivity
@Component(dependencies = [AppComponent::class], modules = [ActivityModule::class])
interface ActivityComponent {
    fun inject(mainActivity: MainActivity)
    fun inject(companyRegistrationActivity: CompanyRegistrationActivity)
    fun inject(workerInfomationDetailActivity: WorkerInfomationDetailActivity)
    fun inject(matchingRequestCompleteActivity: MatchingRequestCompleteActivity)
    fun inject(matchingByEntrySheetCompleteActivity: MatchingByEntrySheetCompleteActivity)
}