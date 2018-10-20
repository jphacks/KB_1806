package com.mybossseasonfinal.justthejob.MainActivity.NavigationDrawerFragment

import android.util.Log
import com.mybossseasonfinal.justthejob.Models.Company
import com.mybossseasonfinal.justthejob.Models.Content
import com.mybossseasonfinal.justthejob.Services.ApiService
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers
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
                Content(name = "Web面接")
        )
    }

    fun getCompany(companyId: Int) {
        apiService.getCompany(companyId)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(object : DisposableSingleObserver<Company>() {
                    override fun onSuccess(company: Company) {
                        Log.d("getCompany()", "${company}")
                        view.showCompanyName(company.name)
                        view.showCompanyLogo(company.img_path)
                    }

                    override fun onError(e: Throwable) {
                        Log.e("getCompany() Error", "{$e.message}")
                    }
                })

    }
}