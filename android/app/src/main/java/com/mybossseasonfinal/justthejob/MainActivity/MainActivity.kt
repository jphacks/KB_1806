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
import com.mybossseasonfinal.justthejob.DI.Component.DaggerActivityComponent
import com.mybossseasonfinal.justthejob.DI.Module.ActivityModule
import com.mybossseasonfinal.justthejob.JustTheJobApp
import com.mybossseasonfinal.justthejob.QRcodeReaderActivity.QRcodeReaderActivity
import com.mybossseasonfinal.justthejob.R
import com.mybossseasonfinal.justthejob.VideoChatActivity.VideoChatActivity
import javax.inject.Inject

class MainActivity : AppCompatActivity(), MainContract.View, NavigationView.OnNavigationItemSelectedListener {

    @Inject
    lateinit var mainPresenter: MainPresenter

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

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.options, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            R.id.action_settings -> Log.d("MainActivity", "Settings Selected!")
        }
        return true
    }


    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menu_item1 -> {
                val intent = Intent(this, QRcodeReaderActivity::class.java)
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
