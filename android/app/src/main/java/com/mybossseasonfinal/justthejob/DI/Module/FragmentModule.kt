package com.mybossseasonfinal.justthejob.DI.Module

import com.mybossseasonfinal.justthejob.MainActivity.CompanyListFragment.CompanyListFragmentContract
import com.mybossseasonfinal.justthejob.MainActivity.MainFragment.WorkerIllustrationFragment.WorkerIllustrationFragmentContract
import com.mybossseasonfinal.justthejob.MainActivity.NavigationDrawerFragment.NavigationDrawerFragmentContract
import com.mybossseasonfinal.justthejob.PerFragment
import dagger.Module
import dagger.Provides

@Module
class FragmentModule {
    private lateinit var navigationDrawerFragmentView: NavigationDrawerFragmentContract.View
    private lateinit var companyListFragmentView: CompanyListFragmentContract.View
    private lateinit var workerIllustrationFragmentView: WorkerIllustrationFragmentContract.View

    constructor(navigationDrawerFragmentView: NavigationDrawerFragmentContract.View) {
        this.navigationDrawerFragmentView = navigationDrawerFragmentView
    }

    constructor(companyListFragmentView: CompanyListFragmentContract.View) {
        this.companyListFragmentView = companyListFragmentView
    }

    constructor(workerIllustrationFragmentView: WorkerIllustrationFragmentContract.View) {
        this.workerIllustrationFragmentView = workerIllustrationFragmentView
    }

    @PerFragment
    @Provides
    fun provideNavigationDrawerFragmentView(): NavigationDrawerFragmentContract.View {
        return navigationDrawerFragmentView
    }

    @PerFragment
    @Provides
    fun provideCompanyListFragmentView(): CompanyListFragmentContract.View {
        return companyListFragmentView
    }

    @PerFragment
    @Provides
    fun provideWorkerIllustrationFragmentView(): WorkerIllustrationFragmentContract.View {
        return workerIllustrationFragmentView
    }
}