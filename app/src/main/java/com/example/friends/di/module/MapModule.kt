package com.example.friends.di.module

import com.example.friends.data.firebase.FriendsAppFirebase
import com.example.friends.map.MapActivity
import com.example.friends.map.MapContract
import com.example.friends.map.MapModel
import com.example.friends.map.MapPresenter
import dagger.Module
import dagger.Provides

@Module
class MapModule{
    @Provides fun provideMainActivity()= MapActivity()

    @Provides fun provideMapPresenter(mapModel: MapContract.MapModel):MapContract.MapPresenter = MapPresenter(mapModel)

    @Provides fun provideMapModel(firebase: FriendsAppFirebase):MapContract.MapModel = MapModel(firebase)
}