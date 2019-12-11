package com.example.friends.di.module

import com.example.friends.firebase.MyFirebase
import com.example.friends.mainactivty.MainActivity
import com.example.friends.mainactivty.MainModel
import com.example.friends.mainactivty.MainPresenter
import com.example.friends.mainactivty.MainContract
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

