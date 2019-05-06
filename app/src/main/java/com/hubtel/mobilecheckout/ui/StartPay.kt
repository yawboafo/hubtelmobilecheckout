package com.hubtel.mobilecheckout.ui

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.view.MenuItem
import android.support.v4.widget.DrawerLayout
import android.support.design.widget.NavigationView
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.Menu
import com.hubtel.mobilecheckout.R
import com.hubtel.mobilecheckout.fragmentui.CustomerVerify
import com.hubtel.mobilecheckout.helpers.Helpme
import kotlinx.android.synthetic.main.activity_start_payment.*

class StartPay : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_pay)
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)



        //val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
       // val navView: NavigationView = findViewById(R.id.nav_view)
        //val toggle = ActionBarDrawerToggle(
          //  this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close
        //)
        //drawerLayout.addDrawerListener(toggle)
        //toggle.syncState()


        title = " "
        supportActionBar?.setDisplayHomeAsUpEnabled(false)


        val fragmentContainer = fragmentContainer
        val customerVeriFrag = CustomerVerify()
        Helpme.toAddFragment(this,fragmentContainer.id,customerVeriFrag)

    }



    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.payment_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }


}
