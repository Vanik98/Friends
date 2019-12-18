package com.example.friends.di.module

import com.example.friends.firebase.MyFirebase
import com.example.friends.activtymain.MainActivity
import com.example.friends.activtymain.MainModel
import com.example.friends.activtymain.MainPresenter
import com.example.friends.activtymain.MainContract
import com.example.friends.savedata.MySheradPreferans
import com.example.friends.ui.MainActivityUI
import dagger.Module
import dagger.Provides
@Module
class MainModule
{
    @Provides fun provideMainActivity()= MainActivity()

    @Provides fun provideMainUI()= MainActivityUI()

    @Provides fun provideMainPresenter(mainModel: MainContract.MainModel):MainContract.MainPresenter = MainPresenter(mainModel)

    @Provides fun provideMainModel(firebase: MyFirebase, msPref: MySheradPreferans):MainContract.MainModel = MainModel(firebase,msPref)
}

