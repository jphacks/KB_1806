package com.mybossseasonfinal.justthejob.MainActivity.NavigationDrawerFragment

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.mybossseasonfinal.justthejob.Models.Content
import com.mybossseasonfinal.justthejob.R

class ContentsAdapter(
        private val context: Context?,
        private var contents: MutableList<Content>,
        private val itemClickListener: ViewHolder.ItemClickListener) : RecyclerView.Adapter<ContentsAdapter.ViewHolder>() {

    private var recyclerView: RecyclerView? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(context)
        val mView = layoutInflater.inflate(R.layout.navigation_drawer_contents_item, parent, false)

        mView.setOnClickListener { view ->
            recyclerView?.let {
                itemClickListener.onItemClick(view, it.getChildAdapterPosition(view))
            }
        }

        return ContentsAdapter.ViewHolder(mView)
    }

    override fun getItemCount(): Int {
        return contents.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.let {
            when (contents[position].name) {

            }
            it.imageViewContentIcon.setImageResource(R.drawable.abc_ic_star_black_48dp)
            it.textViewContentName.text = contents[position].name
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

        var imageViewContentIcon = itemView.findViewById<ImageView>(R.id.imageView_content_icon)
        var textViewContentName = itemView.findViewById<TextView>(R.id.textView_content_name)

        init {
            //layoutの初期設定
        }
    }
}