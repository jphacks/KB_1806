package com.mybossseasonfinal.justthejob.CompanyRegistrationActivity

import android.util.Log
import com.mybossseasonfinal.justthejob.Models.Company
import com.mybossseasonfinal.justthejob.Services.ApiService
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class CompanyRegistrationPresenter @Inject constructor(private var apiService: ApiService, private var view: CompanyRegistrationContract.View) : CompanyRegistrationContract.Presenter {

    override fun getCompany(companyId: Int) {
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