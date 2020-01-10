package com.example.friends.di.module

import com.example.friends.data.firebase.FriendsAppFirebase
import com.example.friends.main.MainActivity
import com.example.friends.main.MainModel
import com.example.friends.main.MainPresenter
import com.example.friends.main.MainContract
import com.example.friends.data.prefs.FriendsAppSheradPreferans
import com.example.friends.anko.MainActivityUI
import dagger.Module
import dagger.Provides
@Module
class MainModule
{
    @Provides fun provideMainActivity()= MainActivity()

    @Provides fun provideMainUI()= MainActivityUI()

    @Provides fun provideMainPresenter(mainModel: MainContract.MainModel):MainContract.MainPresenter = MainPresenter(mainModel)

    @Provides fun provideMainModel(firebase: FriendsAppFirebase, msPref: FriendsAppSheradPreferans):MainContract.MainModel = MainModel(firebase,msPref)
}

