package com.example.friends.di.module

import com.example.friends.firebase.MyFirebase
import com.example.friends.activtymap.MapActivity
import com.example.friends.activtymap.MapContract
import com.example.friends.activtymap.MapModel
import com.example.friends.activtymap.MapPresenter
import dagger.Module
import dagger.Provides

@Module
class MapModule{
    @Provides fun provideMainActivity()= MapActivity()

    @Provides fun provideMapPresenter(mapModel: MapContract.MapModel):MapContract.MapPresenter= MapPresenter(mapModel)

    @Provides fun provideMapModel(firebase: MyFirebase):MapContract.MapModel= MapModel(firebase)
}