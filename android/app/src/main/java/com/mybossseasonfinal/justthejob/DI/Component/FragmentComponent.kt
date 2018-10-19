package com.mybossseasonfinal.justthejob.DI.Component

import com.mybossseasonfinal.justthejob.DI.Module.FragmentModule
import com.mybossseasonfinal.justthejob.MainActivity.CompanyListFragment.CompanyListFragment
import com.mybossseasonfinal.justthejob.MainActivity.MainFragment.WorkerIllustrationFragment.WorkerIllustrationFragment
import com.mybossseasonfinal.justthejob.MainActivity.NavigationDrawerFragment.NavigationDrawerFragment
import com.mybossseasonfinal.justthejob.PerFragment
import dagger.Component

@PerFragment
@Component(dependencies = [AppComponent::class], modules = [FragmentModule::class])
interface FragmentComponent {
    fun inject(navigationDrawerFragment: NavigationDrawerFragment)
    fun inject(companyListFragment: CompanyListFragment)
    fun inject(workerIllustrationFragment: WorkerIllustrationFragment)
}