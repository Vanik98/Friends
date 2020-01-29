package com.example.friends.data

import com.example.friends.data.model.User

object DataController{
    private var user: User? = null

    fun setUser(user: User){
        this.user = User()
    }
    fun getUser() = user
}