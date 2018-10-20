package com.mybossseasonfinal.justthejob.MainActivity.MainFragment.WorkerIllustrationFragment

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.mybossseasonfinal.justthejob.Models.Worker
import com.mybossseasonfinal.justthejob.R

class WorkerIllustrationAdapter(
        private val context: Context?,
        private var workers: List<Worker>,
        private val itemClickListener: ViewHolder.ItemClickListener) : RecyclerView.Adapter<WorkerIllustrationAdapter.ViewHolder>() {

    private var recyclerView: RecyclerView? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(context)
        val mView = layoutInflater.inflate(R.layout.worker_illustration_recycler_item, parent, false)

        mView.setOnClickListener { view ->
            recyclerView?.let {
                itemClickListener.onItemClick(view, it.getChildAdapterPosition(view))
            }
        }

        return WorkerIllustrationAdapter.ViewHolder(mView)
    }

    override fun getItemCount(): Int {
        return workers.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.let {
            Glide.with(it.imageViewWorkerPhoto.context).load(workers[position].img_path).into(it.imageViewWorkerPhoto)
            it.textViewWorkerName.text = workers[position].name
            it.textViewWorkerDepartment.text = workers[position].position
            it.textViewYear.text = "入社${workers[position].working_length}年目"
        }
    }

    override fun onAttachedToRecyclerView(recyclerView: RecyclerView) {
        super.onAttachedToRecyclerView(recyclerView)
        this.recyclerView = recyclerView
    }

    override fun onDetachedFromRecyclerView(recyclerView: RecyclerView) {
        super.onDetachedFromRecyclerView(recyclerView)
        this.recyclerView = null

    }


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        interface ItemClickListener {
            fun onItemClick(view: View, position: Int)
        }

        var imageViewWorkerPhoto = itemView.findViewById<ImageView>(R.id.imageView_worker_photo)
        var textViewWorkerName = itemView.findViewById<TextView>(R.id.textView_workerName)
        var textViewWorkerDepartment = itemView.findViewById<TextView>(R.id.textView_worker_position)
        var textViewYear = itemView.findViewById<TextView>(R.id.textView_entry_year)

        init {
            //layoutの初期設定
        }
    }


}