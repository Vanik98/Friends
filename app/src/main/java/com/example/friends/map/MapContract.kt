package com.example.friends.map

import com.example.friends.base.BaseContract
import com.example.friends.data.model.User

interface MapContract {
    interface MapView : BaseContract.View {
        fun showUserInformation(user:User)
    }

    interface MapPresenter : BaseContract.Presenter<MapView> {
        fun loadData(accountId:String)
    }

    interface MapModel : BaseContract.Model{

        interface OnFinishedListener {

            fun onFinished(user:User)

            fun onFailure(t: Throwable)

        }
        fun getUser(accountId:String,onFinishedListener: OnFinishedListener)
    }
}