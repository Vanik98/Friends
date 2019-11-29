package com.example.friends.di


import com.example.friends.mainactivty.MainActivity
import dagger.Component

@ActivityScope
@Component(dependencies = [ApplicationComponent::class],modules =[ActivityModule::class,MainModule::class,SaveDataModel::class,FirbaseModule::class])
interface ActivityComponent {
    fun inject(activity: MainActivity)
//aaaaaaaaaaaaaaa
}