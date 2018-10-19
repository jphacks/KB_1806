package com.mybossseasonfinal.justthejob.CompanyRegistrationActivity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.google.zxing.ResultPoint
import com.journeyapps.barcodescanner.BarcodeCallback
import com.journeyapps.barcodescanner.BarcodeResult
import com.journeyapps.barcodescanner.CompoundBarcodeView
import com.mybossseasonfinal.justthejob.R


class QrCodeReaderActivity : AppCompatActivity() {

    private lateinit var qrCodeReaderView: CompoundBarcodeView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_qrcode_reader)

        qrCodeReaderView = findViewById(R.id.barcodeView)
    }

    override fun onStart() {
        super.onStart()
        qrCodeReaderView.decodeSingle(object : BarcodeCallback {
            override fun barcodeResult(barcodeResult: BarcodeResult) {
                Log.d("readQR", barcodeResult.text)
                toCompanyRegistrationView(barcodeResult.text)
            }

            override fun possibleResultPoints(list: List<ResultPoint>) {}
        })
    }

    override fun onResume() {
        super.onResume()
        qrCodeReaderView.resume()
    }

    override fun onPause() {
        super.onPause()
        qrCodeReaderView.pause()
    }

    /**
     * 企業登録画面へ遷移
     */
    private fun toCompanyRegistrationView(companyId: String) {
        val intent = Intent(this, CompanyRegistrationActivity::class.java)
        intent.putExtra("COMPANY_ID", companyId)
        startActivity(intent)
    }

}
