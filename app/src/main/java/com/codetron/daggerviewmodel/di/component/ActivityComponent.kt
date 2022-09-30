package com.codetron.daggerviewmodel.di.component

import com.codetron.daggerviewmodel.MainActivity
import com.codetron.daggerviewmodel.di.module.ViewModelModule
import com.codetron.daggerviewmodel.di.scope.ScreenScope
import dagger.Subcomponent

@ScreenScope
@Subcomponent(modules = [ViewModelModule::class])
interface ActivityComponent {

    fun inject(activity: MainActivity)

}