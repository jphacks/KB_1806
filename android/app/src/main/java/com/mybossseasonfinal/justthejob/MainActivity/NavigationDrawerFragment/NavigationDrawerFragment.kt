package com.mybossseasonfinal.justthejob.MainActivity.NavigationDrawerFragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.mybossseasonfinal.justthejob.DI.Component.DaggerFragmentComponent
import com.mybossseasonfinal.justthejob.DI.Module.FragmentModule
import com.mybossseasonfinal.justthejob.JustTheJobApp
import com.mybossseasonfinal.justthejob.MainActivity.CompanyListFragment.CompanyListFragment
import com.mybossseasonfinal.justthejob.R
import javax.inject.Inject

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [NavigationDrawerFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [NavigationDrawerFragment.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class NavigationDrawerFragment : Fragment(), NavigationDrawerFragmentContract.View {

    @Inject
    lateinit var navigationDrawerFragmentPresenter: NavigationDrawerFragmentPresenter
    private var cnt = 0

    companion object {
        fun createInstance(count: Int): NavigationDrawerFragment {
            val navigationDrawerFragment = NavigationDrawerFragment()
            val args = Bundle()
            args.putInt("Counter", count)
            navigationDrawerFragment.arguments = args
            return navigationDrawerFragment
        }
    }

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
        super.onCreateView(inflater, container, savedInstanceState)
        val view = inflater.inflate(R.layout.fragment_navigation_drawer, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val args = arguments

        if (args != null) {
            val count = args.getInt("Counter")
            val str = "NavigationDrawerFragment$count"
            cnt = count + 1

            val textViewEntrySheet = view.findViewById<View>(R.id.entry_sheet).findViewById<TextView>(R.id.textView_content_name)
            val textViewWebTest = view.findViewById<View>(R.id.web_test).findViewById<TextView>(R.id.textView_content_name)
            val textViewEmployeeIllustration = view.findViewById<View>(R.id.employee_illustration).findViewById<TextView>(R.id.textView_content_name)
            val textViewTerminologyIllustration = view.findViewById<View>(R.id.terminology_illustration).findViewById<TextView>(R.id.textView_content_name)
            val textViewInterviewRegistration = view.findViewById<View>(R.id.interview_registration).findViewById<TextView>(R.id.textView_content_name)
            val textViewWebInterView = view.findViewById<View>(R.id.web_interview).findViewById<TextView>(R.id.textView_content_name)
            val textViewComunity = view.findViewById<View>(R.id.comunity).findViewById<TextView>(R.id.textView_content_name)

            val textView = view.findViewById<TextView>(R.id.textview_01)
            textView.text = str

            textViewEntrySheet.text = "エントリーシート"
            textViewWebTest.text = "Webテスト"
            textViewEmployeeIllustration.text = "社員図鑑"
            textViewTerminologyIllustration.text = "専門用語図鑑"
            textViewInterviewRegistration.text = "面接予約"
            textViewWebInterView.text = "Web面接"
            textViewComunity.text = "コミュニティ"
        }

        val button01 = view.findViewById<Button>(R.id.button_01)
        button01.setOnClickListener {
            val fragmentManager = fragmentManager
            if (fragmentManager != null) {
                val fragmentTransaction = fragmentManager.beginTransaction()

                //BackStackを設定
                fragmentTransaction.addToBackStack(null)
                fragmentTransaction.replace(R.id.navigationDrawerFragmentContainer, CompanyListFragment.createInstance(cnt))
                fragmentTransaction.commit()
            }
        }

        //BackStackで一つ戻す
        val pop1 = view.findViewById<Button>(R.id.pop_01)
        pop1.setOnClickListener {
            val fragmentManager = fragmentManager
            if (fragmentManager != null) {
                fragmentManager.popBackStack()
            }
        }
    }
}
