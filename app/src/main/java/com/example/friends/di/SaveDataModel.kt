package com.example.friends.di

import android.app.Activity
import android.content.Context
import android.content.SharedPreferences
import com.example.friends.base.BaseActivity
import com.example.friends.savedata.MySheradPreferans
import dagger.Module
import dagger.Provides
@Module
class SaveDataModel{
    @Provides
    fun provideSharedPreferences(activity: BaseActivity): SharedPreferences
    {
        return  activity.getSharedPreferences("save", Context.MODE_PRIVATE)
    }
    @Provides
    fun  provideMySheradPreferans(sPref: SharedPreferences): MySheradPreferans
    {
        return MySheradPreferans(sPref)
    }

}