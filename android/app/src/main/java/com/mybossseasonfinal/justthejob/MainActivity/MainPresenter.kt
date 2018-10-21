package com.mybossseasonfinal.justthejob.MainActivity

import android.util.Log
import com.mybossseasonfinal.justthejob.Models.User
import com.mybossseasonfinal.justthejob.Services.ApiService
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class MainPresenter @Inject constructor(private var apiService: ApiService, private var view: MainContract.View) : MainContract.Presenter {

    override fun apiRequest() {
        apiService.getUsers()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(object : DisposableSingleObserver<List<User>>() {
                    override fun onSuccess(users: List<User>) {
                        users.forEach { Log.d("Get", it.name) }
                    }

                    override fun onError(e: Throwable) {
                        Log.e("Get", "{$e.message}")
                    }

                })
    }

//    override fun apiPost() {
//        val user = User(1316170150, "ytakaya", 25, "Test", "2018/05/30", "2018/05/30")
//
//        apiService.post(user)
//                .subscribeOn(Schedulers.newThread())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(object : DisposableCompletableObserver() {
//                    override fun onComplete() {
//                        Log.d("test", "Postできたよ")
//                    }
//
//                    override fun onError(e: Throwable) {
//                        Log.d("test", "{$e.message}")
//                    }
//
//                })
//    }
}