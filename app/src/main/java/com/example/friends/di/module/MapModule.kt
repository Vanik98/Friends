package com.example.friends.di.module

import com.example.friends.firebase.MyFirebase
import com.example.friends.mainactivty.MainContract
import com.example.friends.mapactivty.MapActivity
import com.example.friends.mapactivty.MapContract
import com.example.friends.mapactivty.MapModel
import com.example.friends.mapactivty.MapPresenter
import com.example.friends.savedata.MySheradPreferans
import dagger.Module
import dagger.Provides

@Module
class MapModule{
    @Provides fun provideMainActivity()= MapActivity()

    @Provides fun provideMapPresenter(mapModel: MapContract.MapModel):MapContract.MapPresenter= MapPresenter(mapModel)

    @Provides fun provideMapModel(firebase: MyFirebase):MapContract.MapModel= MapModel(firebase)
}