package com.mybossseasonfinal.justthejob.MainActivity.NavigationDrawerFragment

import com.mybossseasonfinal.justthejob.Services.ApiService
import javax.inject.Inject

class NavigationDrawerFragmentPresenter @Inject constructor(
        private val apiService: ApiService,
        private val view: NavigationDrawerFragmentContract.View) : NavigationDrawerFragmentContract.Presenter {
}