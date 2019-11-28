package com.example.friends.di

import com.example.friends.firebase.MyFirebase
import com.example.friends.mainactivty.MainModel
import com.example.friends.mainactivty.MainPresenter
import com.example.friends.mainactivty.MainScreenContract
import com.example.friends.savedata.MySheradPreferans
import com.example.friends.ui.MainActivityUI
import dagger.Module
import dagger.Provides
@Module
class MainModule
{
    @Provides
    fun provideMainUI(): MainActivityUI {
        return MainActivityUI()
    }
    @Provides
    fun provideMainPresenter(mainModel: MainScreenContract.MainModel): MainScreenContract.MainPresenter {
        return MainPresenter(mainModel)
    }
    @Provides
    fun provideMainModel(firebase: MyFirebase, msPref: MySheradPreferans): MainScreenContract.MainModel {
        return MainModel(firebase,msPref)
    }

}