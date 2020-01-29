package com.example.friends.settings

import android.os.Bundle
import com.example.friends.R
import com.example.friends.base.BaseActivity
import com.example.friends.di.component.ApplicationComponent
import com.example.friends.di.component.DaggerActivityComponent
import com.example.friends.di.module.BaseActivityModule
import com.example.friends.di.module.SettingsModule
import com.example.friends.utils.NavigationDrawerUtil
import javax.inject.Inject

class SettingsActivity : BaseActivity(),SettingsContract.SettingsView {
    override fun setupComponent(applicationComponent: ApplicationComponent) {
        DaggerActivityComponent.builder()
            .applicationComponent(applicationComponent)
            .baseActivityModule(BaseActivityModule(this))
            .settingsModule(SettingsModule())
            .build()
            .inject(this)
    }
    @Inject
    lateinit var presenter:SettingsPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
        NavigationDrawerUtil.setToolBar(this)
        presenter.attach(this)
    }
    private fun showSettingsList(){

    }

}
