package com.mybossseasonfinal.justthejob.MainActivity.MainFragment.EntrySheetFragment

import android.util.Log
import com.mybossseasonfinal.justthejob.Models.Company
import com.mybossseasonfinal.justthejob.Services.ApiService
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.observers.DisposableCompletableObserver
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class EntrySheetPresenter @Inject constructor(
        private val apiService: ApiService,
        private val view: EntrySheetContract.View) : EntrySheetContract.Presenter {

    fun postEntrySheet(userId: Int, content: String) {
        apiService.postEntrySheet(userId, content)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(object : DisposableCompletableObserver() {
                    override fun onComplete() {
                        Log.d("test", "Postできたよ")
                    }

                    override fun onError(e: Throwable) {
                        Log.d("test", "{$e.message}")
                    }

                })
    }

    fun getCompany(companyId: Int) {
        apiService.getCompany(companyId)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(object : DisposableSingleObserver<Company>() {
                    override fun onSuccess(company: Company) {
                        Log.d("getCompany()", "${company}")
                        view.showCompanyName(company.name)
                    }

                    override fun onError(e: Throwable) {
                        Log.e("getCompany() Error", "{$e.message}")
                    }
                })

    }
}