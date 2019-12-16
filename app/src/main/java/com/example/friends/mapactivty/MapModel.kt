package com.example.friends.mapactivty

import com.example.friends.entity.Friends
import com.example.friends.entity.User
import com.example.friends.firebase.MyFirebase
import javax.inject.Inject

class MapModel @Inject constructor(
    val firebase: MyFirebase
):MapContract.MapModel{
    override fun getUser(
        accountId: String,
        onFinishedListener: MapContract.MapModel.OnFinishedListener
    ): User = firebase.getUser()

}
