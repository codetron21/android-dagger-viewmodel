package com.codetron.daggerviewmodel.model

import android.util.Log
import com.codetron.daggerviewmodel.TAG
import javax.inject.Inject

class Repository @Inject constructor(private val network: Network) {

    fun print() {
        Log.d(TAG, "Network: $network")
    }

}