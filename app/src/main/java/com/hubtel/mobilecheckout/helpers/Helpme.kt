package com.hubtel.mobilecheckout.helpers

import android.app.Activity
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentActivity



class Helpme {

    companion object {


        fun toAddFragment(context: Activity, fragmentContainerID : Int, fragment: Fragment) {


            val ft = (context as FragmentActivity).supportFragmentManager

            val fragmentTransaction = ft.beginTransaction()

            fragmentTransaction.replace(fragmentContainerID, fragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()


        }

    }
}