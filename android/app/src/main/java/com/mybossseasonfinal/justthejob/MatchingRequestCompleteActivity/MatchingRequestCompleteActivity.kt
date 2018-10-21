package com.mybossseasonfinal.justthejob.MatchingRequestCompleteActivity

import android.content.Intent
import android.os.Bundle
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
import com.mybossseasonfinal.justthejob.Models.Worker
import com.mybossseasonfinal.justthejob.R
import javax.inject.Inject

class MatchingRequestCompleteActivity : AppCompatActivity(), MatchingRequestCompleteContract.View {

    @Inject
    lateinit var matchingRequestCompletePresenter: MatchingRequestCompletePresenter


    private lateinit var worker: Worker

    private lateinit var imageView: ImageView
    private lateinit var textViewCompleteMessage: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_matching_request_complete)
        DaggerActivityComponent.builder()
                .appComponent((applicationContext as JustTheJobApp).getComponent())
                .activityModule(ActivityModule(this))
                .build()
                .inject(this)


        val name = intent.getStringExtra("name")
        val img = intent.getStringExtra("img")
        val companyId = intent.getIntExtra("companyId", 0)

        imageView = findViewById(R.id.imageView)
        textViewCompleteMessage = findViewById(R.id.textView_complete_message)

        Glide.with(this).load(img).into(imageView)
        textViewCompleteMessage.text = "${name}さん\nマッチング申請しました！"

        val buttonBackWorkerIllustration = findViewById<Button>(R.id.button_back)
        buttonBackWorkerIllustration.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("companyId", companyId)
            Log.d("hogehoge", "ここまでは来てるよ〜")
            startActivity(intent)
        }


    }

    override fun setWorkerInfomation(worker: Worker) {
        Glide.with(this).load(worker.img_path).into(imageView)
        textViewCompleteMessage.text = "${worker.name}さんに\n交流申請しました！！！"
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
