package com.codetron.daggerviewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStoreOwner

class ComponentViewModel : ViewModel() {

    var component: Any? = null

    override fun onCleared() {
        component = null
    }

}

@Suppress("UNCHECKED_CAST")
fun <C> ViewModelStoreOwner.getComponent(createComponent: () -> C): C {
    val viewModel = ViewModelProvider(this)[ComponentViewModel::class.java]
    if (viewModel.component == null) {
        viewModel.component = createComponent()
    }
    return viewModel.component as C
}