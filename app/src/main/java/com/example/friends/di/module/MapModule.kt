package com.example.friends.di.module

import com.example.friends.mapactivty.MapsActivity
import dagger.Module
import dagger.Provides

@Module
class MapModule{
    @Provides
    fun provideMainActivity(): MapsActivity {
        return MapsActivity()
    }
}