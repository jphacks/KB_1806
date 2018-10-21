package com.mybossseasonfinal.justthejob.CompanyRegistrationActivity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.mybossseasonfinal.justthejob.DI.Component.DaggerActivityComponent
import com.mybossseasonfinal.justthejob.DI.Module.ActivityModule
import com.mybossseasonfinal.justthejob.JustTheJobApp
import com.mybossseasonfinal.justthejob.MainActivity.MainActivity
import com.mybossseasonfinal.justthejob.Models.Company
import com.mybossseasonfinal.justthejob.R
import javax.inject.Inject


/**
 * 企業登録画面
 */
class CompanyRegistrationActivity : AppCompatActivity(), CompanyRegistrationContract.View {

    private lateinit var companyNameView: TextView
    private lateinit var companyLogoImage: ImageView
    private lateinit var registerButton: Button
    private lateinit var companyInfo: Company

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
            showRegistrationDialog(companyInfo)
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
     * Presenterで取得した企業情報をView内の変数にアタッチ
     */
    override fun attachComapnyInfo(fetchedCompanyInfo: Company) {
        companyInfo = fetchedCompanyInfo
    }

    /**
     * 登録ボタン タップ時の処理
     */
    private fun showRegistrationDialog(companyInfo: Company) {
        Log.d("hoge", "companyid:${companyInfo.id}")
        AlertDialog.Builder(this)
                .setTitle("『 ${companyInfo.name} 』を\nMy企業として登録しました")
                .setPositiveButton("OK") { dialog, which ->
                    companyRegistrationPresenter.postUsersCompany(100, companyInfo.id)
                    toMainView()
                }.show()
    }

    /**
     * メイン画面へ遷移
     */
    private fun toMainView() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}
