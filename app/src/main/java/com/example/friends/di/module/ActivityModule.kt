package com.example.friends.di.module

import com.example.friends.base.BaseActivity
import dagger.Module
import dagger.Provides

@Module
class ActivityModule (
    private val baseActivity:BaseActivity
) {
    @Provides fun provideActivity() = baseActivity
}