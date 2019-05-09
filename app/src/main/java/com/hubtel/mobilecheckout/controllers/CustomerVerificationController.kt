package com.hubtel.mobilecheckout.controllers

import android.os.Build
import android.telephony.PhoneNumberUtils
import com.debut.countrycodepicker.data.Country
import java.util.*
import android.icu.util.ULocale.getCountry
import android.icu.util.ULocale.getISO3Country



class CustomerVerificationController {


companion object {

    fun formatPhoneNumber(number: String,countryIso: String) :String {


       var phoneNumber = number


        if (number.count() == 13 && number[0].toString() == "+" )
            phoneNumber =  number
        else if (number.count() == 10 && number[0].toString() == "0")
            phoneNumber = countryIso+number.drop(0)





        return  phoneNumber

    }
}




}