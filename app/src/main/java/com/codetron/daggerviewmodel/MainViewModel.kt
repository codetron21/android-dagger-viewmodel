package com.codetron.daggerviewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.codetron.daggerviewmodel.di.scope.ScreenScope
import com.codetron.daggerviewmodel.model.Repository
import javax.inject.Inject

@ScreenScope
class MainViewModel @Inject constructor(
    private val repository: Repository
) : ViewModel() {

    fun print(){
        repository.print()
        Log.d(TAG, "Repository: $repository")
    }

}
