package com.mybossseasonfinal.justthejob.MatchingByEntrySheetCompleteActivity

import com.mybossseasonfinal.justthejob.Models.MatchingWorker
import com.mybossseasonfinal.justthejob.Models.Worker

interface MatchingByEntrySheetCompleteContract {
    interface View {
        fun getWorkerInfomation(matchingWorker: MatchingWorker)
        fun setWorkerInfomation(worker: Worker)

    }

    interface Presenter {
        fun getBestMatchWorker(companyId: Int, userId: Int)
        fun getWorker(companyId: Int, workerId: Int)
    }
}