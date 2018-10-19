package com.mybossseasonfinal.justthejob.MainActivity.CompanyListFragment

import com.mybossseasonfinal.justthejob.Models.Company

interface CompanyListFragmentContract {
    interface View {
        fun setMatchedCompany(companies: MutableList<Company>)
    }

    interface Presenter {

    }
}