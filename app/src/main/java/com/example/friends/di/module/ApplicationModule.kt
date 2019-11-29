package com.example.friends.di.module

import android.app.Application
import com.example.friends.FriendsApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApplicationModule(
    private val application: FriendsApplication
) {
    @Provides
    @Singleton
    fun provideApplication(): Application {
        return application
    }

}