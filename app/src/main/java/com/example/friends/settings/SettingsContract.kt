package com.example.friends.settings

import com.example.friends.base.BaseContract

interface SettingsContract : BaseContract{
    interface SettingsView : BaseContract.View {

    }

    interface SettingsPresenter : BaseContract.Presenter<SettingsView> {

    }

    interface SettingsModel : BaseContract.Model{

    }
}