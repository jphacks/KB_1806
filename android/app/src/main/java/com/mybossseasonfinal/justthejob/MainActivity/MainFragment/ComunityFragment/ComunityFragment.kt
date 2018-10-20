package com.mybossseasonfinal.justthejob.MainActivity.MainFragment.ComunityFragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.mybossseasonfinal.justthejob.R

class ComunityFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_comunity, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val args = arguments

        val textViewRoomId = view.findViewById<TextView>(R.id.textView_roomId)
        textViewRoomId.text = "${args!!.getInt("RoomId")}"
    }

    companion object {
        fun createInstance(roomId: Int): ComunityFragment {
            val comunityFragment = ComunityFragment()
            val args = Bundle()
            args.putInt("RoomId", roomId)
            comunityFragment.arguments = args
            return comunityFragment
        }
    }
}
