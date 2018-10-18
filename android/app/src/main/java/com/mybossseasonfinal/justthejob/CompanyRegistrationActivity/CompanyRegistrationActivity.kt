package com.mybossseasonfinal.justthejob.CompanyRegistrationActivity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import com.mybossseasonfinal.justthejob.DI.Component.DaggerActivityComponent
import com.mybossseasonfinal.justthejob.DI.Module.ActivityModule
import com.mybossseasonfinal.justthejob.JustTheJobApp
import com.mybossseasonfinal.justthejob.R
import javax.inject.Inject


class CompanyRegistrationActivity : AppCompatActivity(), CompanyRegistrationContract.View {

    private lateinit var companyIdView: TextView
    private lateinit var companyNameView: TextView
    private lateinit var companyAddressView: TextView

    @Inject
    lateinit var companyRegistrationPresenter: CompanyRegistrationPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_company_registration)

        DaggerActivityComponent.builder()
                .appComponent((applicationContext as JustTheJobApp).getComponent())
                .activityModule(ActivityModule(this))
                .build()
                .inject(this)

        companyIdView = findViewById(R.id.companyIdTextView)
        companyNameView = findViewById(R.id.companyNameTextView)
        companyAddressView = findViewById(R.id.companyAddressTextView)

        var companyId: Int = Integer.parseInt(intent.getStringExtra("COMPANY_ID"))
        companyRegistrationPresenter.getCompany(companyId)
    }

    override fun showCompanyId(companyId: Int) {
        companyIdView.text = "企業ID：${companyId}"
    }

    override fun showCompanyName(companyName: String) {
        companyNameView.text = "企業名：${companyName}"
    }

    override fun showCompanyAddress(companyAddress: String) {
        companyAddressView.text = "企業住所：${companyAddress}"
    }

}
