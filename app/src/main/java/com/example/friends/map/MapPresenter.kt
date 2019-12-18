package com.example.friends.map

import com.example.friends.data.model.User
import javax.inject.Inject

class MapPresenter @Inject constructor(
    var model: MapContract.MapModel
):MapContract.MapPresenter{

    private lateinit var view: MapContract.MapView

    override fun loadData(accountId: String) {
        model.getUser(accountId,object :MapContract.MapModel.OnFinishedListener{
           override fun onFinished(user: User) {
               view.showUserInformation(user)
           }

           override fun onFailure(t: Throwable) {

           }

       })
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
