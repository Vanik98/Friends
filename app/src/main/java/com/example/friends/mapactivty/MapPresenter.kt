package com.example.friends.mapactivty

import com.example.friends.entity.Friends
import javax.inject.Inject

class MapPresenter @Inject constructor(
    var mapModel: MapContract.MapModel
):MapContract.MapPresenter{

    private lateinit var view: MapContract.MapView

    override fun loadData(accountId: String): List<Friends> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun subscribe() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun unsubscribe() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun attach(view: MapContract.MapView) {
        this.view = view
    }

}
