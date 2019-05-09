package com.hubtel.mobilecheckout.Dialogs

import android.R.attr.gravity
import android.app.Dialog
import android.content.Context
import android.databinding.DataBindingUtil.setContentView
import android.view.Gravity
import android.view.LayoutInflater
import com.hubtel.mobilecheckout.R
import com.mohammedalaa.gifloading.LoadingView
import kotlinx.android.synthetic.main.hubtel_progress_dailog.view.*


class HPDialogs(context: Context,loadingTxt: String) : Dialog(context) {


    init {

        val wlmp = window.attributes

        wlmp.gravity = Gravity.CENTER_HORIZONTAL
        window.attributes = wlmp
        setTitle(null)
        setCancelable(false)
        setOnCancelListener(null)
        val view = LayoutInflater.from(context).inflate(
            R.layout.hubtel_progress_dailog, null
        )


        setContentView(view)


        val loadingView = view.loading_view
        loadingView.setLoadingText("")
        loadingView.showLoading()

    }



}