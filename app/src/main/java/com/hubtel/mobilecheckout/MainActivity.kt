package com.hubtel.mobilecheckout

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.hubtel.mobilecheckout.ui.StartPaymentActivity

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val intent = Intent(MainActivity@this,StartPaymentActivity::class.java)
        var but = button
        but.setOnClickListener(object : View.OnClickListener{

            override fun onClick(p0: View?) {





                startActivity(intent)
                //startActivity()

            }
        })

       // var button = findViewById<Button>(R.id.bu)


    }


}
