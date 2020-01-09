package com.example.friends.data.model

data class User (
    var id: String,
    val name: String,
    val surname: String?,
    val phone: String,
    val geolocation: Geolocation?,
    val accountImage:AccountImage?,
    val friends: Friends?
){
    constructor() : this("", "", "", "", null, null,null)
}
