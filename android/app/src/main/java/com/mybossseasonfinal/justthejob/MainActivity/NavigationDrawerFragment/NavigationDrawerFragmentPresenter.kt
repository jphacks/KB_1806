package com.mybossseasonfinal.justthejob.MainActivity.NavigationDrawerFragment

import com.mybossseasonfinal.justthejob.Models.Content
import com.mybossseasonfinal.justthejob.Services.ApiService
import javax.inject.Inject

class NavigationDrawerFragmentPresenter @Inject constructor(
        private val apiService: ApiService,
        private val view: NavigationDrawerFragmentContract.View) : NavigationDrawerFragmentContract.Presenter {

    fun getContents(): MutableList<Content> {
        return mutableListOf(
                Content(name = "エントリーシート"),
                Content(name = "Webテスト"),
                Content(name = "社員図鑑"),
                Content(name = "専門用語図鑑"),
                Content(name = "面接予約"),
                Content(name = "Web面接"),
                Content(name = "コミュニティ")
        )
    }
}