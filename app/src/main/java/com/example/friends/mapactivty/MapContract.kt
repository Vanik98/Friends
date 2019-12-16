package com.example.friends.mapactivty

import com.example.friends.base.BaseContract
import com.example.friends.entity.Friends

interface MapContract {
    interface MapView : BaseContract.View {
    }

    interface MapPresenter : BaseContract.Presenter<MapView> {
        fun loadData(accountId:String):List<Friends>
    }

    interface MapModel : BaseContract.Model{

        interface OnFinishedListener {

            fun onFinished()

            fun onFailure(t: Throwable)

        }
        fun getFriends(accountId:String):List<Friends>
    }
}