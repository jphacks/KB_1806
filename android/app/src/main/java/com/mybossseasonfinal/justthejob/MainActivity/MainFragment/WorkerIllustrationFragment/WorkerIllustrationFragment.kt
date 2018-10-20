package com.mybossseasonfinal.justthejob.MainActivity.MainFragment.WorkerIllustrationFragment

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.mybossseasonfinal.justthejob.DI.Component.DaggerFragmentComponent
import com.mybossseasonfinal.justthejob.DI.Module.FragmentModule
import com.mybossseasonfinal.justthejob.JustTheJobApp
import com.mybossseasonfinal.justthejob.Models.Worker
import com.mybossseasonfinal.justthejob.R
import com.mybossseasonfinal.justthejob.WorkerDetailInfomationActivity.WorkerInfomationDetailActivity
import javax.inject.Inject

class WorkerIllustrationFragment : Fragment(),
        WorkerIllustrationFragmentContract.View,
        WorkerIllustrationAdapter.ViewHolder.ItemClickListener {


    @Inject
    lateinit var workerIllustrationFragmentPresenter: WorkerIllustrationFragmentPresenter

    private lateinit var workerListRecyclerView: RecyclerView

    private var workers: MutableList<Worker> = mutableListOf()
    private var companyId = 0


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
        return inflater.inflate(R.layout.fragment_worker_illustration, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val args = arguments

        setWorkersRecyclerView(args)
    }

    override fun onItemClick(view: View, position: Int) {
        val workerName = workers[position].name
        Toast.makeText(activity, "$workerName さんをタップ", Toast.LENGTH_LONG).show()
        val intent = Intent(activity, WorkerInfomationDetailActivity::class.java)
        intent.putExtra("workerId", workers[position].id)
        intent.putExtra("companyId", companyId)
        startActivity(intent)
    }

    override fun setWorkers(workers: MutableList<Worker>) {
        this.workers.clear()
        this.workers.addAll(workers)
        workerListRecyclerView.adapter.notifyDataSetChanged()
    }

    private fun setWorkersRecyclerView(args: Bundle?) {
        companyId = args!!.getInt("CompanyId")
        workerIllustrationFragmentPresenter.getWorkers(companyId)
        workerListRecyclerView = view!!.findViewById<RecyclerView>(R.id.worker_recycler)
        workerListRecyclerView.adapter = WorkerIllustrationAdapter(activity, workers, this)
        workerListRecyclerView.layoutManager = GridLayoutManager(activity, 2)
    }


    companion object {
        fun createInstance(companyId: Int): WorkerIllustrationFragment {
            val workerIllustrationFragment = WorkerIllustrationFragment()
            val args = Bundle()
            args.putInt("CompanyId", companyId)
            workerIllustrationFragment.arguments = args
            return workerIllustrationFragment
        }
    }
}
