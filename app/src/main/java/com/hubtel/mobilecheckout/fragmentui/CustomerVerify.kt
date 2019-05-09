package com.hubtel.mobilecheckout.fragmentui


import android.media.Image
import android.os.Bundle
import android.support.design.widget.BottomSheetDialogFragment
import android.support.design.widget.Snackbar
import android.support.v4.app.Fragment
import android.view.*
import android.widget.ImageView
import android.widget.Toast
import com.debut.countrycodepicker.CountryPicker
import com.debut.countrycodepicker.data.Country
import com.debut.countrycodepicker.listeners.CountryCallBack

import com.hubtel.mobilecheckout.R
import kotlinx.android.synthetic.main.fragment_customer_verify.*
import kotlinx.android.synthetic.main.fragment_customer_verify.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class CustomerVerify : Fragment() {


    //val phoneNumberField = phoneNumberField


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
        val phoneNumberField = view.phoneNumberField

         imageIcon.setOnClickListener{

             CountryPicker.show(activity?.supportFragmentManager, object : CountryCallBack {
                 override fun onCountrySelected(country: Country) {


                     imageIcon.setImageBitmap(country.flag)
                     //phoneNumberField.hint = country.countryCode
                    // phoneNumberField.setText(country.countryCode)
                  //   phoneNumberField.text =

                    // Snackbar.make(view, "Country : ${country.name} and Country Code : ${country.countryCode}", Snackbar.LENGTH_LONG).show()

                 }
             })
         }
    }
 /*   override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.payment_menu, menu);

        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_summary -> {


                var bottomSheet = SummaryFSheet()
                bottomSheet.show(activity?.supportFragmentManager,"summaryTag")

                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }*/


    /**   override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.payment_menu, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }**/





}
