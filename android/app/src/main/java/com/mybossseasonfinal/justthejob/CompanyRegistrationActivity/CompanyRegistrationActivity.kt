package com.mybossseasonfinal.justthejob.CompanyRegistrationActivity

import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.mybossseasonfinal.justthejob.DI.Component.DaggerActivityComponent
import com.mybossseasonfinal.justthejob.DI.Module.ActivityModule
import com.mybossseasonfinal.justthejob.JustTheJobApp
import com.mybossseasonfinal.justthejob.R
import javax.inject.Inject


/**
 * 企業登録画面
 */
class CompanyRegistrationActivity : AppCompatActivity(), CompanyRegistrationContract.View {

    private lateinit var companyNameView: TextView
    private lateinit var companyLogoImage: ImageView
    private lateinit var registerButton: Button
    private lateinit var companyName: String

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
        registerButton = findViewById(R.id.register_button)

        // 企業情報の取得
        var companyId: Int = Integer.parseInt(intent.getStringExtra("COMPANY_ID"))
        companyRegistrationPresenter.getCompany(companyId)

        // 登録ボタンの処理
        registerButton.setOnClickListener {
            showRegistrationDialog(companyName)
        }
    }

    /**
     * 企業名の表示
     */
    override fun showCompanyName(companyName: String) {
        companyNameView.text = "企業名：${companyName}"
    }

    /**
     * 企業ロゴの表示
     */
    override fun showCompanyLogo(companyLogoUrl: String) {
        Glide.with(this).load(companyLogoUrl).into(companyLogoImage)
    }

    /**
     * Presenterで取得した企業名をView内の変数にアタッチ
     */
    override fun attachComapnyName(fetchedCompanyName: String) {
        companyName = fetchedCompanyName
    }

    /**
     * 登録ボタン タップ時の処理
     */
    private fun showRegistrationDialog(companyName: String) {
        AlertDialog.Builder(this)
                .setTitle("『 ${companyName} 』を\nMy企業として登録しました")
                .setPositiveButton("OK") { dialog, which ->
                }.show()
    }

}
