package com.example.friends.mapactivty

import com.example.friends.base.BaseContract
import com.example.friends.entity.Friends

interface MapActivtyContract {
    interface MapView : BaseContract.View {
    }

    interface MainPresenter : BaseContract.Presenter<MapView> {
        fun loadData():List<Friends>
    }

    interface MainModel : BaseContract.Model{

        interface OnFinishedListener {

            fun onFinished()

            fun onFailure(t: Throwable)

        }
        fun getFriends():List<Friends>
    }
}