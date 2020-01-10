package com.example.friends.di.module

import com.example.friends.anko.DialogLoadingUi
import com.example.friends.base.BaseActivity
import dagger.Module
import dagger.Provides
import org.jetbrains.anko.AnkoContext

@Module
open class BaseActivityModule(
    private val activity: BaseActivity
) {
    @Provides fun provideBaseActivity() = activity

}