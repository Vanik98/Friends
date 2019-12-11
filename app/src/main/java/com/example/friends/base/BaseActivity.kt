package com.example.friends.base

import com.example.friends.di.component.ApplicationComponent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

import com.example.friends.FriendsApplication
import com.example.friends.mainactivty.MainActivity

abstract class BaseActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setupComponent(FriendsApplication.get(this).getAppComponent())
    }

    abstract fun setupComponent(applicationComponent: ApplicationComponent)
}