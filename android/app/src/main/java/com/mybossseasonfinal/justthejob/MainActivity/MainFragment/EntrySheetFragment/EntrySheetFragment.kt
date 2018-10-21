package com.mybossseasonfinal.justthejob.MainActivity.MainFragment.EntrySheetFragment

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.mybossseasonfinal.justthejob.DI.Component.DaggerFragmentComponent
import com.mybossseasonfinal.justthejob.DI.Module.FragmentModule
import com.mybossseasonfinal.justthejob.JustTheJobApp
import com.mybossseasonfinal.justthejob.MatchingByEntrySheetCompleteActivity.MatchingByEntrySheetCompleteActivity
import com.mybossseasonfinal.justthejob.R
import javax.inject.Inject

class EntrySheetFragment : Fragment(), EntrySheetContract.View {


    @Inject
    lateinit var entrySheetPresenter: EntrySheetPresenter

    private lateinit var buttonSubmitEntrySheet: Button
    private lateinit var textViewCompanyName: TextView
    private lateinit var editTextAfterEntry: EditText
    private lateinit var editTextTry: EditText
    private lateinit var editTextReason: EditText
    private lateinit var editTextStandard: EditText

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
        return inflater.inflate(R.layout.fragment_entry_sheet, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var args = arguments

        textViewCompanyName = view.findViewById<TextView>(R.id.textView_company_name)
        buttonSubmitEntrySheet = view.findViewById(R.id.button_submit_entry_sheet)
        editTextAfterEntry = view.findViewById(R.id.editText_after_entry)
        editTextTry = view.findViewById(R.id.editText_try)
        editTextReason = view.findViewById(R.id.editText_reason)
        editTextStandard = view.findViewById(R.id.editText_standard)

        entrySheetPresenter.getCompany(args!!.getInt("CompanyId"))
        buttonSubmitEntrySheet.setOnClickListener {
            val content = editTextAfterEntry.text.toString() + editTextTry.text.toString() + editTextReason.text.toString() + editTextStandard.text.toString()
            val userId = 1

            entrySheetPresenter.postEntrySheet(userId, content)
            val intent = Intent(activity, MatchingByEntrySheetCompleteActivity::class.java)
            intent.putExtra("content", content)
            intent.putExtra("userId", userId)
            intent.putExtra("companyId", args!!.getInt("CompanyId"))
            startActivity(intent)
        }
    }

    override fun showCompanyName(companyName: String) {
        textViewCompanyName.text = "$companyName　エントリーシート"
    }

    companion object {
        fun createInstance(companyId: Int): EntrySheetFragment {
            val entrySheetFragment = EntrySheetFragment()
            val args = Bundle()
            args.putInt("CompanyId", companyId)
            entrySheetFragment.arguments = args
            return entrySheetFragment
        }
    }
}
