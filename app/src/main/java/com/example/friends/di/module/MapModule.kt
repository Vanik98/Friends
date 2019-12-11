package com.example.friends.di.module

import com.example.friends.mapactivty.MapActivity
import dagger.Module
import dagger.Provides

@Module
class MapModule{
    @Provides
    fun provideMainActivity(): MapActivity {
        return MapActivity()
    }
}