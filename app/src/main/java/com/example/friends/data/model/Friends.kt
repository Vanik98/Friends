package com.example.friends.data.model

import java.io.Serializable

class Friends : Serializable {
    constructor()
    constructor(usersIdList: List<String>){
        this.usersIdList = usersIdList
    }

    lateinit var  usersIdList: List<String>
}

