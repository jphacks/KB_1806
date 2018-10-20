package com.mybossseasonfinal.justthejob.MainActivity.NavigationDrawerFragment

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.mybossseasonfinal.justthejob.Models.Comunity
import com.mybossseasonfinal.justthejob.R

class ComunitiesAdapter(
        private val context: Context?,
        private var comunities: MutableList<Comunity>,
        private val comunityItemClickListener: ViewHolder.ItemClickListener) : RecyclerView.Adapter<ComunitiesAdapter.ViewHolder>() {

    private var recyclerView: RecyclerView? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(context)
        val mView = layoutInflater.inflate(R.layout.navigation_drawer_comunities_item, parent, false)

        mView.setOnClickListener { view ->
            recyclerView?.let {
                comunityItemClickListener.onComunityClick(view, it.getChildAdapterPosition(view))
            }
        }

        return ComunitiesAdapter.ViewHolder(mView)
    }

    override fun getItemCount(): Int {
        return comunities.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.let {
            it.textViewComunityName.text = comunities[position].name
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
            fun onComunityClick(view: View, position: Int)
        }

        var textViewComunityName = itemView.findViewById<TextView>(R.id.textView_comunity_name)

        init {
            //layoutの初期設定
        }
    }
}