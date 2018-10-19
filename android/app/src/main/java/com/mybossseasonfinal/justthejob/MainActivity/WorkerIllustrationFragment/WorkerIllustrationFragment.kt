package com.mybossseasonfinal.justthejob.MainActivity.WorkerIllustrationFragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mybossseasonfinal.justthejob.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [WorkerIllustrationFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [WorkerIllustrationFragment.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class WorkerIllustrationFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_worker_illustration, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }


    companion object {
        fun createInstance(): WorkerIllustrationFragment {
            val workerIllustrationFragment = WorkerIllustrationFragment()
            return workerIllustrationFragment
        }
    }
}
