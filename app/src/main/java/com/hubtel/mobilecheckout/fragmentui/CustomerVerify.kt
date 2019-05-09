package com.hubtel.mobilecheckout.fragmentui


import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.*
import com.debut.countrycodepicker.CountryPicker
import com.debut.countrycodepicker.data.Country
import com.debut.countrycodepicker.listeners.CountryCallBack
import com.hubtel.mobilecheckout.dialogs.HPDialogs

import com.hubtel.mobilecheckout.R
import com.hubtel.mobilecheckout.controllers.CustomerVerificationController
import kotlinx.android.synthetic.main.fragment_customer_verify.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class CustomerVerify : Fragment() {



    lateinit var countryThis: Country


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_customer_verify, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val imageIcon = view.countryCodeImg
        val verifyButton = view.verifyButton
        val phoneNumberField = view.phoneNumberField



        verifyButton.setOnClickListener {

            Log.d("Debug","formaterd number {${CustomerVerificationController.formatPhoneNumber(phoneNumberField.text.toString(),countryThis.countryCode)}()}")

           // var hpdailog = context?.let { it1 -> HPDialogs(it1,"Verifying phone number ...") }
            //hpdailog?.show()

        }

         imageIcon.setOnClickListener{

             CountryPicker.show(activity?.supportFragmentManager, object : CountryCallBack {
                 override fun onCountrySelected(country: Country) {

                     Log.d("debug","$country")
                     countryThis = country

                     imageIcon.setImageBitmap(country.flag)


                 }
             })
         }
    }



}
