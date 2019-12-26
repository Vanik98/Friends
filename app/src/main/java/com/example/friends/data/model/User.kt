package com.example.friends.data.model

import java.io.Serializable

class User : Serializable{
    constructor()
    constructor(
        id: String,
        name: String,
        surname: String?,
        phone: String,
        geolocation: Geolocation?,
        accountImage:AccountImage?,
        friends: Friends?
    ){
        this.id = id
        this.name = name
        this.surname = surname
        this.phone = phone
        this.geolocation = geolocation
        this.accountImage = accountImage
        this.friends = friends
    }
     var id: String = ""
     var name: String = ""
     var surname: String? = ""
     var  phone: String = ""
     var geolocation: Geolocation? = null
     var accountImage:AccountImage?= null
     var friends: Friends? = null
}
