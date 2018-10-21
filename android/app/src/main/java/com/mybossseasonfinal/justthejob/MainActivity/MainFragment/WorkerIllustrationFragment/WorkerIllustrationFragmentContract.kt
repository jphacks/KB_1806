package com.mybossseasonfinal.justthejob.MainActivity.MainFragment.WorkerIllustrationFragment

import com.mybossseasonfinal.justthejob.Models.Worker

interface WorkerIllustrationFragmentContract {
    interface View {
        fun setWorkers(workers: MutableList<Worker>)
    }

    interface Presenter {
        fun getWorkers(companyId: Int)
    }
}