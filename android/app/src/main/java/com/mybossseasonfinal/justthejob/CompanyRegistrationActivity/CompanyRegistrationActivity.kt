package com.mybossseasonfinal.justthejob.CompanyRegistrationActivity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.mybossseasonfinal.justthejob.DI.Component.DaggerActivityComponent
import com.mybossseasonfinal.justthejob.DI.Module.ActivityModule
import com.mybossseasonfinal.justthejob.JustTheJobApp
import com.mybossseasonfinal.justthejob.R
import kotlinx.android.synthetic.main.activity_company_registration.*
import javax.inject.Inject


class CompanyRegistrationActivity : AppCompatActivity(), CompanyRegistrationContract.View {

    private lateinit var companyNameView: TextView
    private lateinit var companyLogoImage: ImageView

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

        companyNameView = findViewById(R.id.company_name_text)
        companyLogoImage = findViewById(R.id.logo_image)

        var companyId: Int = Integer.parseInt(intent.getStringExtra("COMPANY_ID"))
        companyRegistrationPresenter.getCompany(companyId)

    }

    override fun showCompanyName(companyName: String) {
        company_name_text.text = "企業名：${companyName}"
    }

    override fun showCompanyLogo(companyLogoUrl: String) {
        Glide.with(this).load(companyLogoUrl).into(companyLogoImage)
    }

}
