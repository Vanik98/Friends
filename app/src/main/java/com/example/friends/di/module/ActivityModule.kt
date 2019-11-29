package com.example.friends.di.module

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
