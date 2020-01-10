package com.example.friends.map

import com.example.friends.data.firebase.FriendsAppFirebase
import javax.inject.Inject

class MapModel @Inject constructor(
    val firebase: FriendsAppFirebase
):MapContract.MapModel{

    override fun getUser(accountId: String, onFinishedListener: MapContract.MapModel.OnFinishedListener)
            = firebase.getUser(accountId,onFinishedListener)

}
