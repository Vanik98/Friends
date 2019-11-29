package com.example.friends.di.component


import com.example.friends.di.*
import com.example.friends.di.module.ActivityModule
import com.example.friends.di.module.FirbaseModule
import com.example.friends.di.module.MainModule
import com.example.friends.di.module.SaveDataModel
import com.example.friends.mainactivty.MainActivity
import dagger.Component

@ActivityScope
@Component(dependencies = [ApplicationComponent::class],modules =[ActivityModule::class, MainModule::class, SaveDataModel::class, FirbaseModule::class])
interface ActivityComponent {
    fun inject(activity: MainActivity)

}