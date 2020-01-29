package com.example.friends.anko

import android.content.DialogInterface
import android.view.Gravity
import android.view.View
import org.jetbrains.anko.*

class DialogLoadingUi(ui: AnkoContext<View>) {
    val dialog: DialogInterface

    init {
        with(ui) {
            dialog = alert("Loading...") {
                customView {
                    linearLayout {
                        linearLayout{
                            progressBar() {}.lparams(width = dip(50), height = dip(50)) {
                            gravity = Gravity.CENTER
                        }
                        }.lparams(width = matchParent, height = matchParent) {
                                gravity = Gravity.CENTER
                        }
                    }
                }
            }.show()

        }
    }
}