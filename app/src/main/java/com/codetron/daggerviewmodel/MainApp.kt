package com.codetron.daggerviewmodel

import android.app.Activity
import android.app.Application
import com.codetron.daggerviewmodel.di.component.DaggerAppComponent

class MainApp : Application() {

    val appComponent by lazy { DaggerAppComponent.create() }

}

fun Activity.appComponent() = (applicationContext as MainApp).appComponent

const val TAG = "DaggerViewModel"