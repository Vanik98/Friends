package com.example.friends.di.component

import com.example.friends.di.*
import com.example.friends.di.module.*
import com.example.friends.mainactivty.MainActivity
import com.example.friends.mapactivty.MapActivity
import dagger.Component

@ActivityScope
@Component(
    dependencies = [ApplicationComponent::class],
    modules =[BaseActivityModule::class,MainModule::class,MapModule::class,FirbaseModule::class,SaveDataModule::class]
)
interface ActivityComponent {
    fun inject(activity: MainActivity)
    fun inject(activity: MapActivity)
}