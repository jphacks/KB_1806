package com.mybossseasonfinal.justthejob.MatchingByEntrySheetCompleteActivity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.mybossseasonfinal.justthejob.BigFiveAnalyzeResultActivity.BigFiveAnalyzeResultActivity
import com.mybossseasonfinal.justthejob.DI.Component.DaggerActivityComponent
import com.mybossseasonfinal.justthejob.DI.Module.ActivityModule
import com.mybossseasonfinal.justthejob.JustTheJobApp
import com.mybossseasonfinal.justthejob.MatchingRequestCompleteActivity.MatchingRequestCompleteActivity
import com.mybossseasonfinal.justthejob.Models.MatchingWorker
import com.mybossseasonfinal.justthejob.Models.Worker
import com.mybossseasonfinal.justthejob.R
import javax.inject.Inject

class MatchingByEntrySheetCompleteActivity : AppCompatActivity(), MatchingByEntrySheetCompleteContract.View {

    @Inject
    lateinit var matchingByEntrySheetCompletePresenter: MatchingByEntrySheetCompletePresenter

    private lateinit var imageViewWorker: ImageView
    private lateinit var textViewBestMatchWorker: TextView
    private lateinit var textViewMatchRate: TextView

    private var content = ""
    private var userId = 1
    private lateinit var name: String
    private lateinit var imgUrl: String

    var companyId = 3

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_matching_by_entry_sheet_complete)

        DaggerActivityComponent.builder()
                .appComponent((applicationContext as JustTheJobApp).getComponent())
                .activityModule(ActivityModule(this))
                .build()
                .inject(this)

        content = intent.getStringExtra("content")
        userId = intent.getIntExtra("userId", 0)

        imageViewWorker = findViewById(R.id.imageView_worker)
        textViewBestMatchWorker = findViewById(R.id.textView_best_match_worker)
        textViewMatchRate = findViewById(R.id.textView_matching_percent)


        val buttonRequestMatching = findViewById<Button>(R.id.button_request_matching)
        buttonRequestMatching.setOnClickListener {
            val intent = Intent(this, MatchingRequestCompleteActivity::class.java)
            intent.putExtra("name", name)
            intent.putExtra("img", imgUrl)
            intent.putExtra("companyId", companyId)
            startActivity(intent)
        }

        val buttonCheckAnalyzeResult = findViewById<Button>(R.id.button_check_analyze_result)
        buttonCheckAnalyzeResult.setOnClickListener {
            val intent = Intent(this, BigFiveAnalyzeResultActivity::class.java)
//            intent.putExtra("name", name)
//            intent.putExtra("img", imgUrl)
//            intent.putExtra("companyId", companyId)
            startActivity(intent)
        }

        matchingByEntrySheetCompletePresenter.getBestMatchWorker(companyId, userId)
    }

    override fun getWorkerInfomation(matchingWorker: MatchingWorker) {
        matchingByEntrySheetCompletePresenter.getWorker(companyId, matchingWorker.employee_id)
        var matchingRate: Int = (matchingWorker.matching_rate * 100).toInt()
        textViewMatchRate.text = "マッチ度 ${matchingRate}%"
    }

    override fun setWorkerInfomation(worker: Worker) {
        Glide.with(this).load(worker.img_path).into(imageViewWorker)
        textViewBestMatchWorker.text = "${worker.name}さん"
        name = worker.name
        imgUrl = worker.img_path

    }
}
