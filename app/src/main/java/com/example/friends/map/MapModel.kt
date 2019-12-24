package com.example.friends.map

import android.util.Log
import com.example.friends.data.model.User
import com.example.friends.data.firebase.MyFirebase
import javax.inject.Inject

class MapModel @Inject constructor(
    val firebase: MyFirebase
):MapContract.MapModel{

    override fun getUser(accountId: String, onFinishedListener: MapContract.MapModel.OnFinishedListener)
            = firebase.getUser(accountId,onFinishedListener)

}
