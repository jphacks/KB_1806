package com.mybossseasonfinal.justthejob.MatchingRequestCompleteActivity

import com.mybossseasonfinal.justthejob.Models.Worker

interface MatchingRequestCompleteContract {
    interface View {
        fun setWorkerInfomation(worker: Worker)
    }

    interface Presenter {
        fun getWorker(companyId: Int, workerId: Int)
    }
}