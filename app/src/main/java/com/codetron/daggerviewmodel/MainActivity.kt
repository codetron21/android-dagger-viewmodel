package com.codetron.daggerviewmodel

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        val component = getComponent { appComponent().newActivityComponent() }
        component.inject(this)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this, viewModelFactory)[MainViewModel::class.java]
        Log.d(TAG, "ViewModel: $viewModel")
        Log.d(TAG, "ViewModelFactory: $viewModelFactory")
        Log.d(TAG, "Component: $component")
        viewModel.print()
    }

}