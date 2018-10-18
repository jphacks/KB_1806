package com.mybossseasonfinal.justthejob.CompanyRegistrationActivity

interface CompanyRegistrationContract {
    interface View {
        fun showCompanyId(companyId: Int)
        fun showCompanyName(companyName: String)
        fun showCompanyAddress(companyAddress: String)
    }

    interface Presenter {
        fun getCompany(companyId: Int): Unit
    }
}