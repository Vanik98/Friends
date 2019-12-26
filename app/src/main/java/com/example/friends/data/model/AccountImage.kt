package com.example.friends.data.model

import android.net.Uri
import java.io.Serializable

class AccountImage : Serializable {
    constructor()
    constructor(imageUri: Uri,
                extension: String){
        this.imageUri = imageUri
        this.extension = extension
    }
   lateinit var imageUri: Uri
    lateinit var  extension: String
}

