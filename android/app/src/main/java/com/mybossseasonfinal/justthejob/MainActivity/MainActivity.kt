package com.mybossseasonfinal.justthejob.MainActivity

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.mybossseasonfinal.justthejob.CompanyRegistrationActivity.QrCodeReaderActivity
import com.mybossseasonfinal.justthejob.DI.Component.DaggerActivityComponent
import com.mybossseasonfinal.justthejob.DI.Module.ActivityModule
import com.mybossseasonfinal.justthejob.JustTheJobApp
import com.mybossseasonfinal.justthejob.MainActivity.NavigationDrawerFragment.NavigationDrawerFragment
import com.mybossseasonfinal.justthejob.MainActivity.WorkerIllustrationFragment.WorkerIllustrationFragment
import com.mybossseasonfinal.justthejob.R
import com.mybossseasonfinal.justthejob.VideoChatActivity.VideoChatActivity
import javax.inject.Inject

class MainActivity : AppCompatActivity(), MainContract.View, NavigationView.OnNavigationItemSelectedListener {

    @Inject
    lateinit var mainPresenter: MainPresenter

    var companyId = 0
    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DaggerActivityComponent.builder()
                .appComponent((applicationContext as JustTheJobApp).getComponent())
                .activityModule(ActivityModule(this))
                .build()
                .inject(this)

        mainPresenter.apiPost()

        //Toolbar
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        //DrawerToggle
        val drawer = findViewById<DrawerLayout>(R.id.drawerLayout)
        val toggle = ActionBarDrawerToggle(this, drawer, toolbar, R.string.drawer_open, R.string.drawer_close)
        drawer.addDrawerListener(toggle)
        toggle.syncState()

        //NavigationView Listener
        val navigationView = findViewById<NavigationView>(R.id.navigationView)
        navigationView.setNavigationItemSelectedListener(this)

        //NavigationDrawerFragment
        if (savedInstanceState == null) {
            val navigationDrawerTransaction = supportFragmentManager.beginTransaction()
            val mainFieldTransaction = supportFragmentManager.beginTransaction()

            navigationDrawerTransaction.addToBackStack(null)
            mainFieldTransaction.addToBackStack(null)

            companyId = intent.getIntExtra("companyId", 0)

            navigationDrawerTransaction.replace(R.id.navigationDrawerFragmentContainer, NavigationDrawerFragment.createInstance(companyId))
            mainFieldTransaction.replace(R.id.mainFragmentContainer, WorkerIllustrationFragment.createInstance())

            navigationDrawerTransaction.commit()
            mainFieldTransaction.commit()
        }

    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "現在表示中企業のCompanyID：$companyId", Toast.LENGTH_LONG).show()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.options, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            R.id.action_calendar -> Log.d("MainActivity", "Settings Selected!")
            R.id.action_acceptance_company -> Log.d("MainActivity", "Settings Selected!")
            R.id.action_read_qr -> {
                val intent = Intent(this, QrCodeReaderActivity::class.java)
                startActivity(intent)
            }
            R.id.action_settings -> Log.d("MainActivity", "Settings Selected!")
            R.id.action_logout -> Log.d("MainActivity", "Settings Selected!")
        }
        return true
    }


    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menu_item1 -> {
                val intent = Intent(this, QrCodeReaderActivity::class.java)
                startActivity(intent)
            }
            R.id.menu_item2 -> {
                val intent = Intent(this, VideoChatActivity::class.java)
                startActivity(intent)
            }
            R.id.menu_item3 -> Log.d("MainActivity", "3 Selected")
            R.id.menu_item4 -> Log.d("MainActivity", "4 Selected")
        }
        val drawer = findViewById<DrawerLayout>(R.id.drawerLayout)
        drawer.closeDrawer(GravityCompat.START)
        return true
    }

}
