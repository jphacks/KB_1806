package com.mybossseasonfinal.justthejob.WorkerDetailInfomationActivity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.mybossseasonfinal.justthejob.DI.Component.DaggerActivityComponent
import com.mybossseasonfinal.justthejob.DI.Module.ActivityModule
import com.mybossseasonfinal.justthejob.JustTheJobApp
import com.mybossseasonfinal.justthejob.MatchingRequestCompleteActivity.MatchingRequestCompleteActivity
import com.mybossseasonfinal.justthejob.Models.Worker
import com.mybossseasonfinal.justthejob.R
import javax.inject.Inject

class WorkerInfomationDetailActivity : AppCompatActivity(), WorkerInfomationDetailContract.View {


    @Inject
    lateinit var workerInfomationDetailPresenter: WorkerInfomationDetailPresenter

    lateinit var imageViewWorkerPhoto: ImageView
    lateinit var textViewWorkerName: TextView
    lateinit var textViewWorkerDepartment: TextView
    lateinit var textViewYear: TextView
    lateinit var textViewSelfIntroduction: TextView
    lateinit var textViewWorkDetail: TextView
    lateinit var textViewHoliday: TextView
    lateinit var buttonApplication: Button

    private var workerId = 0
    private var companyId = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_worker_infomation_detail)
        DaggerActivityComponent.builder()
                .appComponent((applicationContext as JustTheJobApp).getComponent())
                .activityModule(ActivityModule(this))
                .build()
                .inject(this)

        imageViewWorkerPhoto = findViewById<ImageView>(R.id.imageView_worker_photo_big)
        textViewWorkerName = findViewById<TextView>(R.id.textView_worker_name)
        textViewWorkerDepartment = findViewById<TextView>(R.id.textView_worker_department)
        textViewYear = findViewById<TextView>(R.id.textView_year)
        textViewSelfIntroduction = findViewById<TextView>(R.id.textView_self_introduction)
        textViewWorkDetail = findViewById<TextView>(R.id.textView_work_detail)
        textViewHoliday = findViewById<TextView>(R.id.textView_holiday)
        buttonApplication = findViewById<Button>(R.id.button_application)




        workerId = intent.getIntExtra("workerId", 0)
        companyId = intent.getIntExtra("companyId", 0)


        workerInfomationDetailPresenter.getWorker(companyId, workerId)

    }

    override fun setWorkerInfomation(worker: Worker) {
        Glide.with(this).load(worker.img_path).into(imageViewWorkerPhoto)
        textViewWorkerName.text = "${worker.name}さん（${worker.age}）"
        textViewWorkerDepartment.text = "${worker.position}所属"
        textViewYear.text = "${worker.join_company}年入社　入社${worker.working_length}年目"
        textViewSelfIntroduction.text = "${worker.self_introduction}"
        textViewWorkDetail.text = "${worker.business_outline}"
        textViewHoliday.text = "${worker.holiday}"
        buttonApplication.setOnClickListener {
            val intent = Intent(this, MatchingRequestCompleteActivity::class.java)
            intent.putExtra("name", worker.name)
            intent.putExtra("img", worker.img_path)
            intent.putExtra("companyId", companyId)
            startActivity(intent)
        }
    }

}
