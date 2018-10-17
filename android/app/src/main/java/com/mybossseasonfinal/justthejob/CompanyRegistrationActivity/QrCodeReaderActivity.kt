package com.mybossseasonfinal.justthejob.CompanyRegistrationActivity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.google.zxing.integration.android.IntentIntegrator
import com.google.zxing.integration.android.IntentResult
import com.mybossseasonfinal.justthejob.R

class QrCodeReaderActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_qrcode_reader)

        val intentIntegrator = IntentIntegrator(this).initiateScan()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        var intentResult: IntentResult = IntentIntegrator.parseActivityResult(requestCode, resultCode, data)
        if (intentResult != null) {
            Log.d("readQR", intentResult.contents)
            toCompanyInformationView(intentResult.contents)

        } else {
            super.onActivityResult(requestCode, resultCode, data)
        }
    }

    private fun toCompanyInformationView(companyId: String) {
        val intent = Intent(this, CompanyRegistrationActivity::class.java)
        intent.putExtra("COMPANY_ID", companyId)
        startActivity(intent)
    }

}
