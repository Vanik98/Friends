package com.example.friends.di

import com.example.friends.FriendsApplication
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class,NetworkModule::class])
interface ApplicationComponent {
     fun inject(friendsApplication: FriendsApplication)
}