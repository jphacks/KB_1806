package com.mybossseasonfinal.justthejob.MainActivity.MainFragment.WebTestFragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mybossseasonfinal.justthejob.R


class WebTestFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_web_test, container, false)
    }

    companion object {
        fun createInstance(): WebTestFragment {
            val webTestFragment = WebTestFragment()
            return webTestFragment
        }
    }
}
