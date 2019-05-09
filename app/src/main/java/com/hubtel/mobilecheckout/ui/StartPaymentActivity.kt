package com.hubtel.mobilecheckout.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.BottomSheetDialogFragment
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.hubtel.mobilecheckout.R
import com.hubtel.mobilecheckout.fragmentui.CustomerVerify
import com.hubtel.mobilecheckout.fragmentui.SummaryFSheet
import com.hubtel.mobilecheckout.helpers.Helpme
import kotlinx.android.synthetic.main.activity_start_payment.*

class StartPaymentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_payment)


        title = " "

        val fragmentContainer = fragmentContainer
        val customerVeriFrag = CustomerVerify()
        Helpme.toAddFragment(this,fragmentContainer.id,customerVeriFrag)





    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.payment_menu, menu)
        return true
    }

    // actions on click menu items
    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.action_summary -> {
            var dailog = SummaryFSheet()
            dailog.show(supportFragmentManager,"noTag")
            true
        }

        else -> {
            // If we got here, the user's action was not recognized.
            // Invoke the superclass to handle it.
            super.onOptionsItemSelected(item)
        }
    }


  /**  override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.title) {
            "Search" -> {

                var dailog = BottomSheetDialogFragment()
                dailog.show(supportFragmentManager,"noTag")

                true
            }


            else -> super.onOptionsItemSelected(item)
        }
    }**/


  /**override fun onCreateOptionsMenu(menu: Menu): Boolean {
      val inflater = menuInflater
      inflater.inflate(R.menu.payment_menu, menu)
      return true
  }

    // actions on click menu items
    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.action_summary -> {
            var dailog = BottomSheetDialogFragment()
            dailog.show(supportFragmentManager,"noTag")
            true
        }

        else -> {
            // If we got here, the user's action was not recognized.
            // Invoke the superclass to handle it.
            super.onOptionsItemSelected(item)
        }
    }

**/

}
