package com.example.friends.mapactivty

import com.example.friends.entity.Friends
import com.example.friends.firebase.MyFirebase
import javax.inject.Inject

class MapModel @Inject constructor(
    val firebase: MyFirebase
):MapContract.MapModel{
    override fun getFriends(accountId: String): List<Friends> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
