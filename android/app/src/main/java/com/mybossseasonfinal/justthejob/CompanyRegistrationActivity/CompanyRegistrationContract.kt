package com.mybossseasonfinal.justthejob.CompanyRegistrationActivity

interface CompanyRegistrationContract {
    interface View {
        fun showCompanyName(companyName: String)
        fun showCompanyLogo(companyLogoUrl: String)
    }

    interface Presenter {
        fun getCompany(companyId: Int): Unit
    }
}