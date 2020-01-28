package com.example.friends.di.module

import com.example.friends.friendsinfo.FriendsInfoActivity
import dagger.Module
import dagger.Provides

@Module
class FriendsInfoModule {
    @Provides
    fun provideSettingsActivity()= FriendsInfoActivity()
}