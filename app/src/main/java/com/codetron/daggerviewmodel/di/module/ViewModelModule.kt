package com.codetron.daggerviewmodel.di.module

import androidx.lifecycle.ViewModel
import com.codetron.daggerviewmodel.MainViewModel
import com.codetron.daggerviewmodel.di.keys.MainViewModelKey
import com.codetron.daggerviewmodel.di.scope.ScreenScope

import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface ViewModelModule {

    @Binds
    @IntoMap
    @ScreenScope
    @MainViewModelKey(MainViewModel::class)
    fun bindMainViewModel(impl: MainViewModel): ViewModel

}