package com.example.friends.settings

import javax.inject.Inject

class SettingsPresenter @Inject constructor(
    var model: SettingsContract.SettingsModel
): SettingsContract.SettingsPresenter{

    private lateinit var view: SettingsContract.SettingsView

    override fun subscribe() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun unsubscribe() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun attach(view: SettingsContract.SettingsView) {
        this.view = view
    }
}