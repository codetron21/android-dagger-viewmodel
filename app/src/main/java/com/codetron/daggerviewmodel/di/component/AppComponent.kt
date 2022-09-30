package com.codetron.daggerviewmodel.di.component

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component
interface AppComponent {

    fun newActivityComponent(): ActivityComponent

}