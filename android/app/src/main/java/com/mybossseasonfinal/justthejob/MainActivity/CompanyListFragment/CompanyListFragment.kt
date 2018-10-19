package com.mybossseasonfinal.justthejob.MainActivity.CompanyListFragment

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.view.GravityCompat
import android.support.v4.widget.DrawerLayout
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.mybossseasonfinal.justthejob.DI.Component.DaggerFragmentComponent
import com.mybossseasonfinal.justthejob.DI.Module.FragmentModule
import com.mybossseasonfinal.justthejob.JustTheJobApp
import com.mybossseasonfinal.justthejob.MainActivity.MainActivity
import com.mybossseasonfinal.justthejob.MainActivity.NavigationDrawerFragment.NavigationDrawerFragment
import com.mybossseasonfinal.justthejob.Models.Company
import com.mybossseasonfinal.justthejob.R
import javax.inject.Inject

class CompanyListFragment : Fragment(),
        CompanyListFragmentContract.View,
        CompanyListAdapter.ViewHolder.ItemClickListener {


    @Inject
    lateinit var companyListFragmentPresenter: CompanyListFragmentPresenter
    private lateinit var matchingCompanyList: MutableList<Company>
    private var companyId = 0


    companion object {
        fun createInstance(): CompanyListFragment {
            return CompanyListFragment()
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DaggerFragmentComponent.builder()
                .appComponent((activity?.applicationContext as JustTheJobApp).getComponent())
                .fragmentModule(FragmentModule(this))
                .build()
                .inject(this)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_company_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val args = arguments


        //マッチング済み会社リストの設定
        matchingCompanyList = companyListFragmentPresenter.getMatchingCompanyList()
        val companyListRecyclerView = view.findViewById<RecyclerView>(R.id.matching_company_list)
        companyListRecyclerView.adapter = CompanyListAdapter(activity, matchingCompanyList, this)
        companyListRecyclerView.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        

        val button02 = view.findViewById<Button>(R.id.button_02)
        button02.setOnClickListener {
            val fragmentManager = fragmentManager
            if (fragmentManager != null) {
                val fragmentTransaction = fragmentManager.beginTransaction()

                //BackStackを設定
                fragmentTransaction.addToBackStack(null)
                fragmentTransaction.replace(R.id.navigationDrawerFragmentContainer, NavigationDrawerFragment.createInstance(companyId))
                fragmentTransaction.commit()
            }
        }

        //BackStackで一つ戻す
        val pop2 = view.findViewById<Button>(R.id.pop_02)
        pop2.setOnClickListener {
            val fragmentManager = fragmentManager
            if (fragmentManager != null) {
                fragmentManager.popBackStack()
            }
        }
    }

    override fun onItemClick(view: View, position: Int) {
        Toast.makeText(activity, "${matchingCompanyList[position].name} がタップされた", Toast.LENGTH_LONG).show()
        val drawer = activity?.findViewById<DrawerLayout>(R.id.drawerLayout)
        drawer?.closeDrawer(GravityCompat.START)
        val intent = Intent(activity, MainActivity::class.java)
        intent.putExtra("companyId", matchingCompanyList[position].id)
        startActivity(intent)
        activity!!.finish()
    }
}
