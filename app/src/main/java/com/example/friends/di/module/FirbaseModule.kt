package com.example.friends.di.module

import com.example.friends.base.BaseActivity
import com.example.friends.data.firebase.MyFirebase
import dagger.Module
import dagger.Provides

@Module
class FirbaseModule{
    @Provides fun provideFirebase(activity:BaseActivity)= MyFirebase(activity)
}