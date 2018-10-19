package com.mybossseasonfinal.justthejob.MainActivity.CompanyListFragment

import com.mybossseasonfinal.justthejob.Models.Company
import com.mybossseasonfinal.justthejob.Services.ApiService
import javax.inject.Inject

class CompanyListFragmentPresenter @Inject constructor(
        private val apiService: ApiService,
        private val view: CompanyListFragmentContract.View) : CompanyListFragmentContract.Presenter {

    fun getMatchingCompanyList(): MutableList<Company> {
        return mutableListOf(
                Company(_id = "1", id = 1, name = "NTT docomo", founder = "吉澤社長", founding = "1993", address = "溜池山王", img_path = "a"),
                Company(_id = "2", id = 2, name = "野村総合研究所", founder = "？？？", founding = "????", address = "横浜みなとみらい", img_path = ""),
                Company(_id = "3", id = 3, name = "NTTデータ", founder = "？？？", founding = "????", address = "豊洲", img_path = "")
        )
    }
}