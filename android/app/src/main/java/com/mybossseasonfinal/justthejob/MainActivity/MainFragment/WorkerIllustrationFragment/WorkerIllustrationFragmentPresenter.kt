package com.mybossseasonfinal.justthejob.MainActivity.MainFragment.WorkerIllustrationFragment

import android.util.Log
import com.mybossseasonfinal.justthejob.Models.Worker
import com.mybossseasonfinal.justthejob.Services.ApiService
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class WorkerIllustrationFragmentPresenter @Inject constructor(
        private val apiService: ApiService,
        private val view: WorkerIllustrationFragmentContract.View) : WorkerIllustrationFragmentContract.Presenter {
    override fun getWorkers(companyId: Int) {
        apiService.getWorkers(companyId)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(object : DisposableSingleObserver<MutableList<Worker>>() {
                    override fun onSuccess(workers: MutableList<Worker>) {
                        view.setWorkers(workers)
                    }

                    override fun onError(e: Throwable) {
                        Log.e("getWorkers() Error", "{$e.message}")
                    }
                })
    }
}