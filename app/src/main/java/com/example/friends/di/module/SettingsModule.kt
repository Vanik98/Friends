package com.example.friends.di.module

import com.example.friends.settings.SettingsActivity
import dagger.Module
import dagger.Provides

@Module
class SettingsModule {
    @Provides
    fun provideSettingsActivity()= SettingsActivity()
}