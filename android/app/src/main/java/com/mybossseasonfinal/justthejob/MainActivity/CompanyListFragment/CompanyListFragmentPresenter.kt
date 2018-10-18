package com.mybossseasonfinal.justthejob.MainActivity.CompanyListFragment

import com.mybossseasonfinal.justthejob.Services.ApiService
import javax.inject.Inject

class CompanyListFragmentPresenter @Inject constructor(
        private val apiService: ApiService,
        private val view: CompanyListFragmentContract.View) : CompanyListFragmentContract.Presenter {

}