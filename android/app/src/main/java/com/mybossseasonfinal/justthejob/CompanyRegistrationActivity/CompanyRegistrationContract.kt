package com.mybossseasonfinal.justthejob.CompanyRegistrationActivity

import com.mybossseasonfinal.justthejob.Models.Company

interface CompanyRegistrationContract {
    interface View {
        fun showCompanyName(companyName: String)
        fun showCompanyLogo(companyLogoUrl: String)
        fun attachComapnyInfo(companyInfo: Company)
    }

    interface Presenter {
        fun getCompany(companyId: Int)
        fun postUsersCompany(userId: Int, companyId: Int)
    }
}