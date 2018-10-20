package com.mybossseasonfinal.justthejob.MainActivity

interface MainContract {
    interface View {

    }

    interface Presenter {
        fun apiRequest(): Unit
//        fun apiPost(): Unit
    }
}