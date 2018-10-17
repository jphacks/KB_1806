package com.mybossseasonfinal.justthejob.CompanyRegistrationActivity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.mybossseasonfinal.justthejob.DI.Component.DaggerActivityComponent
import com.mybossseasonfinal.justthejob.DI.Module.ActivityModule
import com.mybossseasonfinal.justthejob.JustTheJobApp
import com.mybossseasonfinal.justthejob.R
import javax.inject.Inject

class CompanyRegistrationActivity : AppCompatActivity() {

    @Inject
    lateinit var companyRegistrationPresenter: CompanyRegistrationPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_company_information)

        DaggerActivityComponent.builder()
                .appComponent((applicationContext as JustTheJobApp).getComponent())
                .activityModule(ActivityModule(this))
                .build()
                .inject(this)

        var companyId: Int = Integer.parseInt(intent.getStringExtra("COMPANY_ID"))



        Log.d("hoge", "-----------------")
        Log.d("hoge", "" + companyId)
        Log.d("hoge", "-----------------")
    }
}
