package com.mybossseasonfinal.justthejob.WorkerDetailInfomationActivity

import com.mybossseasonfinal.justthejob.Models.Worker

interface WorkerInfomationDetailContract {
    interface View {
        fun setWorkerInfomation(worker: Worker)
    }

    interface Presenter {
        fun getWorker(companyId: Int, workerId: Int)
    }
}