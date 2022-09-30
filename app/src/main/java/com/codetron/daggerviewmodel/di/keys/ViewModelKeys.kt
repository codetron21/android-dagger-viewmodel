package com.codetron.daggerviewmodel.di.keys

import androidx.lifecycle.ViewModel
import dagger.MapKey
import kotlin.reflect.KClass

@MapKey
annotation class MainViewModelKey(val kClass: KClass<out ViewModel>)