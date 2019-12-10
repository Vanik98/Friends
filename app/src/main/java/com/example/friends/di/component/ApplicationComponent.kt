package com.example.friends.di.component

import com.example.friends.FriendsApplication
import com.example.friends.di.module.ApplicationModule
import com.example.friends.di.module.FirbaseModule
import com.example.friends.di.module.NetworkModule
import com.example.friends.di.module.SaveDataModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class, NetworkModule::class])
interface ApplicationComponent {
     fun inject(friendsApplication: FriendsApplication)
}