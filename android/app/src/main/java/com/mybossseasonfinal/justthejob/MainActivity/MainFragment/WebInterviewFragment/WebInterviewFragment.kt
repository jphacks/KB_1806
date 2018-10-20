package com.mybossseasonfinal.justthejob.MainActivity.MainFragment.WebInterviewFragment

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import com.mybossseasonfinal.justthejob.R
import com.mybossseasonfinal.justthejob.WebInterviewActivity.WebInterviewActivity

class WebInterviewFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_web_interview, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val editTextInterviewId = view.findViewById<EditText>(R.id.editText_interview_id)
        val buttonEnterInterview = view.findViewById<Button>(R.id.button_enter_interview)
        val doorImageView = view.findViewById<ImageView>(R.id.doorImageView)

        doorImageView.setImageResource(R.drawable.web_interview_wait_door)

        buttonEnterInterview.setOnClickListener {
            val intent = Intent(activity, WebInterviewActivity::class.java)
            startActivity(intent)
        }

    }


    companion object {
        fun createInstance(): WebInterviewFragment {
            val webInterviewFragment = WebInterviewFragment()
            return webInterviewFragment
        }
    }
}
