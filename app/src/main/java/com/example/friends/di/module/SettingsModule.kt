package com.example.friends.di.module

import com.example.friends.settings.SettingsActivity
import com.example.friends.settings.SettingsContract
import com.example.friends.settings.SettingsModel
import com.example.friends.settings.SettingsPresenter
import dagger.Module
import dagger.Provides

@Module
class SettingsModule {
    @Provides fun provideSettingsActivity()= SettingsActivity()

    @Provides fun provideMapPresenter(settingsModel: SettingsContract.SettingsModel):SettingsContract.SettingsPresenter = SettingsPresenter(settingsModel)

    @Provides fun provideMapModel():SettingsContract.SettingsModel = SettingsModel()
}