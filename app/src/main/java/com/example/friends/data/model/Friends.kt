package com.example.friends.data.model

data class Friends(
    val usersIdList: ArrayList<String>
){
    constructor():this(arrayListOf(""))
}

