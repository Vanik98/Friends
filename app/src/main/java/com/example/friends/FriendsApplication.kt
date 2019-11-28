package com.example.friends

import android.app.Application
import com.example.friends.di.ApplicationComponent
import android.content.Context
import androidx.multidex.MultiDex
import androidx.multidex.MultiDexApplication
import com.example.friends.di.ApplicationModule
import com.example.friends.di.DaggerApplicationComponent


class FriendsApplication : Application(){
    private lateinit var component: ApplicationComponent

    companion object {
        fun get(context: Context): FriendsApplication {
            return context.applicationContext as FriendsApplication
        }
    }


    override fun onCreate() {
        super.onCreate()
        setupGraph()
    }

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }

    private fun setupGraph() {
        component = DaggerApplicationComponent.builder()
            .applicationModule(ApplicationModule(this))
                .build()
        component.inject(this)
    }

    fun getAppComponent()=component

}