package com.example.friends.anko

import android.content.DialogInterface
import android.view.Gravity
import android.view.View
import androidx.core.content.res.ResourcesCompat
import com.example.friends.R
import org.jetbrains.anko.*

class DialogLoadingUi(ui: AnkoContext<View>) {
    val dialog: DialogInterface

    init {
        with(ui) {
            dialog = alert {
                isCancelable = false
                relativeLayout {
                    customView {
                        progressBar() {  backgroundColor = ResourcesCompat.getColor(resources, R.color.colorGrayAlpha, null)}.lparams(width = dip(5), height = dip(5)) {
                            gravity = Gravity.CENTER

                        }

                    }
                }
            }.show()

        }
    }
}