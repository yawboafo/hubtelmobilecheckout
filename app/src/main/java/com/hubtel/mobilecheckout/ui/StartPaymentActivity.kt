package com.hubtel.mobilecheckout.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import com.hubtel.mobilecheckout.R
import com.hubtel.mobilecheckout.fragmentui.CustomerVerify
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
}
