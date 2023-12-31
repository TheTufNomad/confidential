package com.confidential.ui.base

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.google.android.material.snackbar.Snackbar


abstract class BaseViewModel(private val app : Application) : AndroidViewModel(app) {

    fun string(resourceId: Int) : String {
       return app.baseContext.getString(resourceId)
    }

    fun string(resourceId: Int, vararg args: Int) : String {
        return app.baseContext.getString(resourceId,args)
    }
}