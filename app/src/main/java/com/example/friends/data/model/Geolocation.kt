package com.example.friends.data.model

data class Geolocation(
    val lat:Double,
    val lan:Double
) {
    constructor():this(0.0,0.0)
}