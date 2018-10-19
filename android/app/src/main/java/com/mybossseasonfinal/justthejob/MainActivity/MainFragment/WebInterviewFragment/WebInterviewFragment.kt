package com.mybossseasonfinal.justthejob.MainActivity.MainFragment.WebInterviewFragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mybossseasonfinal.justthejob.R

class WebInterviewFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_web_interview, container, false)
    }

    companion object {
        fun createInstance(): WebInterviewFragment {
            val webInterviewFragment = WebInterviewFragment()
            return webInterviewFragment
        }
    }
}
