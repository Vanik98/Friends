package com.example.friends.di.module

import android.app.Activity
import android.content.Context
import android.content.SharedPreferences
import com.example.friends.base.BaseActivity
import com.example.friends.savedata.MySheradPreferans
import dagger.Module
import dagger.Provides
@Module
class SaveDataModule {
    @Provides
    fun provideSharedPreferences(activity:BaseActivity): SharedPreferences {
        return  activity.getSharedPreferences("save", Context.MODE_PRIVATE)
    }

    @Provides
    fun  provideMySheradPreferans(sPref: SharedPreferences): MySheradPreferans {
        return MySheradPreferans(sPref)
    }
}