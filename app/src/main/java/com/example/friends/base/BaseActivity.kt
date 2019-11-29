package com.example.friends.base

import com.example.friends.di.component.ApplicationComponent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

import com.example.friends.FriendsApplication

abstract class BaseActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

       Log.d("vvv","${this.application.javaClass.name} aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa")

        setupComponent(FriendsApplication.get(this).getAppComponent())
    }

     abstract fun setupComponent(applicationComponent: ApplicationComponent)
}