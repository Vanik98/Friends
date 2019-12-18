package com.example.friends.data.model

class User(
    val id: String,
    val name: String,
    val surname: String?,
    val phone: Int? = 0,
    val geolocation: Geolocation?,
    val friends: Friends
)
