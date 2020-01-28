package com.example.friends.anko

import android.content.DialogInterface
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.core.content.res.ResourcesCompat
import com.example.friends.R
import org.jetbrains.anko.*

class DialogRegistrationUi(ui: AnkoContext<View>) {
    val dialog: DialogInterface
    lateinit var verifyCode: EditText
    lateinit var chackCode: Button

    init {
        with(ui) {
            dialog = alert("enter verification code") {
                customView {
                    verticalLayout {
                        verifyCode = editText {
                            textSize = 18f
                            backgroundColor =
                                ResourcesCompat.getColor(resources, R.color.colorBlack, null)
                            textColor =
                                ResourcesCompat.getColor(resources, R.color.colorWhite, null)
                        }.lparams(width = matchParent, height = dip(40)) {

                        }
                        chackCode = button("enter code") {

                        }.lparams(width = matchParent, height = dip(45)) {
                            gravity = Gravity.CENTER
                            topMargin = dip(50)
                            leftMargin = dip(5)
                            rightMargin = dip(5)
                        }
                    }
                }

            }.show()

        }
    }
}