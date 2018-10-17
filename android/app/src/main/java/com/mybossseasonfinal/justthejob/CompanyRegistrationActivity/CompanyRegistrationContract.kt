package com.mybossseasonfinal.justthejob.CompanyRegistrationActivity

interface CompanyRegistrationContract {
    interface View {

    }

    interface Presenter {
        fun getCompany(companyId: Int): Unit
    }
}