package com.mybossseasonfinal.justthejob.DI.Module

import com.mybossseasonfinal.justthejob.MainActivity.CompanyListFragment.CompanyListFragmentContract
import com.mybossseasonfinal.justthejob.MainActivity.NavigationDrawerFragment.NavigationDrawerFragmentContract
import com.mybossseasonfinal.justthejob.PerFragment
import dagger.Module
import dagger.Provides

@Module
class FragmentModule {
    private lateinit var navigationDrawerFragmentView: NavigationDrawerFragmentContract.View
    private lateinit var companyListFragmentView: CompanyListFragmentContract.View

    constructor(navigationDrawerFragmentView: NavigationDrawerFragmentContract.View) {
        this.navigationDrawerFragmentView = navigationDrawerFragmentView
    }

    constructor(companyListFragmentView: CompanyListFragmentContract.View) {
        this.companyListFragmentView = companyListFragmentView
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
}