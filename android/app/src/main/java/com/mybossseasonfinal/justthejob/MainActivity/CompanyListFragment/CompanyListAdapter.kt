package com.mybossseasonfinal.justthejob.MainActivity.CompanyListFragment

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.mybossseasonfinal.justthejob.Models.Company
import com.mybossseasonfinal.justthejob.R

class CompanyListAdapter(
        private val context: Context?,
        private var companies: MutableList<Company>,
        private val itemClickListener: ViewHolder.ItemClickListener) : RecyclerView.Adapter<CompanyListAdapter.ViewHolder>() {

    private var recyclerView: RecyclerView? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(context)
        val mView = layoutInflater.inflate(R.layout.company_list_recycler_item, parent, false)

        mView.setOnClickListener { view ->
            recyclerView?.let {
                itemClickListener.onItemClick(view, it.getChildAdapterPosition(view))
            }
        }

        return CompanyListAdapter.ViewHolder(mView)
    }

    override fun getItemCount(): Int {
        return companies.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.let {
            //            it.imageViewCompanyIcon =
            it.textViewCompanyName.text = companies[position].name
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

        var imageViewCompanyIcon = itemView.findViewById<ImageView>(R.id.imageView_company_icon)
        var textViewCompanyName = itemView.findViewById<TextView>(R.id.textView_company_name)

        init {
            //layoutの初期設定
        }
    }
}