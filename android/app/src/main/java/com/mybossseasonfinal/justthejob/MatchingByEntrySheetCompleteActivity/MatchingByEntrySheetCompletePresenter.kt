package com.mybossseasonfinal.justthejob.MatchingByEntrySheetCompleteActivity

import android.util.Log
import com.mybossseasonfinal.justthejob.Models.MatchingWorker
import com.mybossseasonfinal.justthejob.Models.Worker
import com.mybossseasonfinal.justthejob.Services.ApiService
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class MatchingByEntrySheetCompletePresenter @Inject constructor(private var apiService: ApiService, private var view: MatchingByEntrySheetCompleteContract.View) : MatchingByEntrySheetCompleteContract.Presenter {
    override fun getBestMatchWorker(companyId: Int, userId: Int) {
        apiService.getBestMatchWorker(companyId, userId)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(object : DisposableSingleObserver<MatchingWorker>() {
                    override fun onSuccess(matchingWorker: MatchingWorker) {
                        view.getWorkerInfomation(matchingWorker)
                    }

                    override fun onError(e: Throwable) {
                        Log.e("getWorkers() Error", "{$e.message}")
                    }
                })
    }

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