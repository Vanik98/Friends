package com.example.friends.di.module

import android.content.Context
import android.content.SharedPreferences
import com.example.friends.base.BaseActivity
import com.example.friends.savedata.MySheradPreferans
import dagger.Module
import dagger.Provides
@Module
class SaveDataModule
{
    @Provides fun provideSharedPreferences(activity: BaseActivity)=
        activity.getSharedPreferences("save", Context.MODE_PRIVATE)

    @Provides
    fun  provideMySheradPreferans(sPref: SharedPreferences)= MySheradPreferans(sPref)

}