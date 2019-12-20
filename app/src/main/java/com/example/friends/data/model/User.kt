package com.example.friends.data.model

class User(
    val id: String,
    val name: String,
    val surname: String?,
    val phone: Int,
    val geolocation: Geolocation?,
    val accountImage:AccountImage?,
    val friends: Friends?
)
