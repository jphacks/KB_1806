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

    fun getMatchingCompanyList(): List<Company> {
        var result = listOf<Company>(
                Company(_id = "1", id = 1, name = "NTT docomo", founder = "吉澤社長", founding = "1993", address = "溜池山王", img_path = ""),
                Company(_id = "2", id = 2, name = "野村総合研究所", founder = "？？？", founding = "????", address = "横浜みなとみらい", img_path = ""),
                Company(_id = "3", id = 3, name = "NTTデータ", founder = "？？？", founding = "????", address = "豊洲", img_path = "")
        )


        apiService.getAllCompany()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(object : DisposableSingleObserver<List<Company>>() {
                    override fun onSuccess(companies: List<Company>) {
                        view.showMatchingCompanyList(companies)
                    }

                    override fun onError(e: Throwable) {
                        Log.e("getCompany() Error", "{$e.message}")
                    }
                })

        return result

    }
}