package com.codetron.daggerviewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.codetron.daggerviewmodel.di.scope.ScreenScope
import javax.inject.Inject
import javax.inject.Provider
import javax.inject.Singleton

@ScreenScope
class ViewModelFactory @Inject constructor(
    private val mapVm: @JvmSuppressWildcards Map<Class<out ViewModel>, Provider<ViewModel>>
) : ViewModelProvider.Factory {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return mapVm[modelClass]?.get() as T
    }
}