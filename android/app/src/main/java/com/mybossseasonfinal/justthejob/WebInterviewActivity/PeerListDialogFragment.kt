package com.mybossseasonfinal.justthejob.WebInterviewActivity

import android.app.DialogFragment
import android.content.Context
import android.graphics.Point
import android.os.Bundle
import android.view.*
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import com.mybossseasonfinal.justthejob.R
import java.util.*

/**
 *
 * PeerListDialogFragment.java
 *
 */
class PeerListDialogFragment : DialogFragment(), AdapterView.OnItemClickListener {

    private var _lvList: ListView? = null

    private var _listener: PeerListDialogFragmentListener? = null
    private var _items: ArrayList<String>? = null

    interface PeerListDialogFragmentListener {
        fun onItemClick(item: String)
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle): View? {
        val window = dialog.window
        window!!.requestFeature(Window.FEATURE_NO_TITLE)

        val context = inflater.context
        val wm = context.getSystemService(Context.WINDOW_SERVICE) as WindowManager
        val display = wm.defaultDisplay
        val ptSize = Point()
        display.getSize(ptSize)

        window.setLayout(ptSize.x * 2 / 3, ptSize.y * 2 / 3)

        val vwDialog = inflater.inflate(R.layout.fragment_dialog_peerlist, container, false)
        _lvList = vwDialog.findViewById(R.id.listView)
        _lvList!!.onItemClickListener = this

        return vwDialog
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val adapter = ArrayAdapter(activity, android.R.layout.simple_list_item_1, _items!!)
        _lvList!!.adapter = adapter
    }

    override fun onDestroyView() {
        _listener = null
        _lvList = null
        _items = null

        super.onDestroyView()
    }

    override fun onItemClick(parent: AdapterView<*>, view: View, position: Int, id: Long) {
        if (null != _listener) {
            val item = _items!![position]
            _listener!!.onItemClick(item)
        }

        dismiss()
    }

    fun setListener(listener: PeerListDialogFragmentListener) {
        _listener = listener
    }

    fun setItems(list: ArrayList<String>) {
        _items = list
    }
}