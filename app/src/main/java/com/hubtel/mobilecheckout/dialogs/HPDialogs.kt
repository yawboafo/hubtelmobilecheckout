package com.hubtel.mobilecheckout.dialogs

import android.app.Dialog
import android.content.Context
import android.view.Gravity
import android.view.LayoutInflater
import com.hubtel.mobilecheckout.R
import kotlinx.android.synthetic.main.hubtel_progress_dailog.view.*


class HPDialogs(context: Context,loadingTxt: String) : Dialog(context) {


    init {

        val wlmp = window.attributes

        wlmp.gravity = Gravity.CENTER_VERTICAL
        window.attributes = wlmp
        setTitle(null)
        setCancelable(false)
        setOnCancelListener(null)
        val view = LayoutInflater.from(context).inflate(
            R.layout.hubtel_progress_dailog, null
        )


        setContentView(view)


        val loadingView = view.loading_view
        var  loadingTxtview = view.loaderTxt
        loadingTxtview.text = loadingTxt

        loadingView.showLoading()

    }



}