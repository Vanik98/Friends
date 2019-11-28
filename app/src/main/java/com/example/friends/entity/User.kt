package com.example.friends.entity

class User(
    val id: String,
    val name: String,
    val surname: String?,
    val phone: Int? = 0,
    val geolocation: Geolocation?,
    val friends: Friends
)
