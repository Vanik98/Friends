package com.example.friends.anko

import android.content.DialogInterface
import android.view.View
import org.jetbrains.anko.*

class DialogLoadingUi(ui: AnkoContext<View>) {
    val dialog: DialogInterface
    init {
        with(ui) {
            dialog=alert("Loading..."){
                customView {
                    progressBar(){
                    }
                }

            }.show()

        }
    }
}