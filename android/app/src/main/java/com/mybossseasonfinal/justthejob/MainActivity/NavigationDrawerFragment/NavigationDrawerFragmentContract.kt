package com.mybossseasonfinal.justthejob.MainActivity.NavigationDrawerFragment

interface NavigationDrawerFragmentContract {
    interface View {
        fun showCompanyName(companyName: String)
        fun showCompanyLogo(companyLogoUrl: String)
    }

    interface Presenter {

    }
}