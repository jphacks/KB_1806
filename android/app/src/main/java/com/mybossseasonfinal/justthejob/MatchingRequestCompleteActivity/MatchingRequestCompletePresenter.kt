package com.mybossseasonfinal.justthejob.MatchingRequestCompleteActivity

import android.util.Log
import com.mybossseasonfinal.justthejob.Models.Worker
import com.mybossseasonfinal.justthejob.Services.ApiService
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class MatchingRequestCompletePresenter @Inject constructor(private var apiService: ApiService, private var view: MatchingRequestCompleteContract.View) : MatchingRequestCompleteContract.Presenter {
    override fun getWorker(companyId: Int, workerId: Int) {
        apiService.getWorker(companyId, workerId)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(object : DisposableSingleObserver<Worker>() {
                    override fun onSuccess(worker: Worker) {
                        view.setWorkerInfomation(worker)
                    }

                    override fun onError(e: Throwable) {
                        Log.e("getWorkers() Error", "{$e.message}")
                    }
                })
    }
}
