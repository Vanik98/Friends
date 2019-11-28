package com.example.friends.di

import com.example.friends.base.BaseActivity
import dagger.Module
import dagger.Provides

@Module
class ActivityModule(
    private var activity: BaseActivity
) {
    @Provides
    fun provideActivity(): BaseActivity {
        return activity
    }

}
