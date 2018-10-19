package com.mybossseasonfinal.justthejob.MainActivity.CompanyListFragment

import android.util.Log
import com.mybossseasonfinal.justthejob.Models.Company
import com.mybossseasonfinal.justthejob.Services.ApiService
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class CompanyListFragmentPresenter @Inject constructor(
        private val apiService: ApiService,
        private val view: CompanyListFragmentContract.View) : CompanyListFragmentContract.Presenter {

    fun getMatchedCompanyList() {
        apiService.getAllCompany()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(object : DisposableSingleObserver<MutableList<Company>>() {
                    override fun onSuccess(companies: MutableList<Company>) {
                        view.setMatchedCompany(companies)
                    }

                    override fun onError(e: Throwable) {
                        var result2 = mutableListOf<Company>(
                                Company(_id = "1", id = 1, name = "Error", founder = "", founding = "", address = "", img_path = ""),
                                Company(_id = "2", id = 2, name = "Error2", founder = "", founding = "", address = "", img_path = "")
                        )
                        view.setMatchedCompany(result2)
                        Log.e("getCompany() Error", "{$e.message}")
                    }
                })
    }
}