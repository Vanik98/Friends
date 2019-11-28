package com.example.friends.mapactivty

import com.example.friends.base.BaseContract

interface MapActivtyContract {
    interface MapView : BaseContract.View {

    }

    interface MainPresenter : BaseContract.Presenter<MapView> {



    }

    interface MainModel : BaseContract.Model{

        interface OnFinishedListener {

            fun onFinished()

            fun onFailure(t: Throwable)

        }

    }
}