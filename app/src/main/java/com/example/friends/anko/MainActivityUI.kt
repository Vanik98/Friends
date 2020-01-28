package com.example.friends.anko

import android.annotation.TargetApi
import android.os.Build
import android.text.InputFilter
import android.text.InputType
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.EditText

import androidx.core.content.res.ResourcesCompat
import com.example.friends.R
import com.example.friends.main.MainActivity
import org.jetbrains.anko.*

class MainActivityUI : AnkoComponent<MainActivity> {

    lateinit var v: View
    lateinit var createAccount: Button
    lateinit var phoneNumber: EditText
    lateinit var numberCode: EditText
    lateinit var name: EditText
    lateinit var sname: EditText

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    override fun createView(ui: AnkoContext<MainActivity>) = with(ui) {
        verticalLayout {
            clipToPadding = false
            backgroundColor = ResourcesCompat.getColor(resources, R.color.colorWhite, null)
            imageView {
                setImageResource(R.drawable.logo_friends)

            }.lparams(width = dip(300), height = dip(200)) {
                topMargin = dip(50)
                gravity = Gravity.CENTER
            }
            textView("Name") {
                textSize = 15f
                textColor = ResourcesCompat.getColor(resources, R.color.colorBlack, null)
            }.lparams(width = wrapContent, height = wrapContent) {
                leftMargin = dip(15)
                rightMargin = dip(15)
            }
            name = editText {
                textSize = 18f
                textColor = ResourcesCompat.getColor(resources, R.color.colorBlack, null)
                background = ResourcesCompat.getDrawable(resources, R.drawable.textview_border, null)
            }.lparams(width = matchParent, height = dip(45)) {
                topMargin = dip(5)
                leftMargin = dip(15)
                rightMargin = dip(15)
            }
            textView("Surname") {
                textSize = 15f
                textColor = ResourcesCompat.getColor(resources, R.color.colorBlack, null)
            }.lparams(width = wrapContent, height = wrapContent) {
                topMargin = dip(5)
                leftMargin = dip(15)
                rightMargin = dip(15)
            }
            sname = editText {
                textSize = 18f
                textColor = ResourcesCompat.getColor(resources, R.color.colorBlack, null)
                background = ResourcesCompat.getDrawable(resources, R.drawable.textview_border, null)
            }.lparams(width = matchParent, height = dip(45)) {
                topMargin = dip(5)
                leftMargin = dip(15)
                rightMargin = dip(15)
            }
            linearLayout {
                textView("Code:") {
                    textSize = 15f
                    textColor = ResourcesCompat.getColor(resources, R.color.colorBlack, null)
                }.lparams(width = wrapContent, height = dip(20)) {
                    topMargin = dip(5)
                    leftMargin = dip(15)
                    rightMargin = dip(15)
                }
                textView("Number:") {
                    textSize = 15f
                    textColor = ResourcesCompat.getColor(resources, R.color.colorBlack, null)
                }.lparams(width = wrapContent, height = dip(20)) {
                    topMargin = dip(5)
                    leftMargin = dip(30)
                    rightMargin = dip(15)
                }
            }
            linearLayout {
                numberCode = editText() {
                    textSize = 18f
                    textColor = ResourcesCompat.getColor(resources, R.color.colorBlack, null)
                    background = ResourcesCompat.getDrawable(resources, R.drawable.textview_border, null)
                    elevation = dip(4).toFloat()
                    leftPadding = dip(2)
                    filters = arrayOf(InputFilter.LengthFilter(4))
                }.lparams(width = dip(50), height = dip(45)) {
                    leftMargin = dip(15)
                    rightMargin = dip(15)
                }
                phoneNumber = editText {
                    textSize = 18f
                    textColor = ResourcesCompat.getColor(resources, R.color.colorBlack, null)
                    inputType = InputType.TYPE_CLASS_NUMBER
                    background = ResourcesCompat.getDrawable(resources, R.drawable.textview_border, null)
                    elevation = dip(4).toFloat()
                    leftPadding = dip(10)
                }.lparams(width = matchParent, height = dip(45)) {
                    leftMargin = dip(15)
                    rightMargin = dip(15)
                }

            }
            createAccount = button("Create Account") {
                background =
                    ResourcesCompat.getDrawable(resources, R.drawable.button_color_change, null)
                textColor = ResourcesCompat.getColor(resources, R.color.colorWhite, null)

            }.lparams(width = matchParent, height = dip(45)) {
                gravity = Gravity.CENTER
                topMargin = dip(50)
                leftMargin = dip(15)
                rightMargin = dip(15)
            }
            v = view()
        }
    }
}
