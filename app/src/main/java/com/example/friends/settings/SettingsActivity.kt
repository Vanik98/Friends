package com.example.friends.settings

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.friends.R
import com.example.friends.base.BaseActivity
import com.example.friends.di.component.ApplicationComponent
import com.example.friends.di.component.DaggerActivityComponent
import com.example.friends.di.module.BaseActivityModule
import com.example.friends.di.module.FirbaseModule
import com.example.friends.di.module.MapModule
import com.example.friends.di.module.SettingsModule
import com.example.friends.navigationdrawer.NavigationDrawer
import com.google.android.material.navigation.NavigationView

class SettingsActivity : BaseActivity() {
    override fun setupComponent(applicationComponent: ApplicationComponent) {
        DaggerActivityComponent.builder()
            .applicationComponent(applicationComponent)
            .baseActivityModule(BaseActivityModule(this))
            .settingsModule(SettingsModule())
            .build()
            .inject(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
        NavigationDrawer.setToolBar(this)
    }
}
