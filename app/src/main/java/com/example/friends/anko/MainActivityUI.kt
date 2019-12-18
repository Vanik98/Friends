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

     lateinit var create_account:Button
     lateinit var phoneNumber:EditText
     lateinit var numberCode:EditText
     lateinit var v: View
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    override fun createView(ui: AnkoContext<MainActivity>) = with(ui) {
        verticalLayout {
            clipToPadding = false
            backgroundColor = ResourcesCompat.getColor(resources, R.color.colorWhite, null)
            textView("Friends") {
                textSize = 70f
                textColor = ResourcesCompat.getColor(resources, R.color.colorBlack, null)
                gravity = Gravity.CENTER
                typeface = ResourcesCompat.getFont(context, R.font.alex_brush)
            }.lparams(width = matchParent, height = dip(100)) {
                topMargin = dip(50)
                leftMargin = dip(5)
                rightMargin = dip(5)
            }
            linearLayout {
                textView("Code:") {
                    textSize = 15f
                    textColor = ResourcesCompat.getColor(resources, R.color.colorBlack, null)
                }.lparams(width = wrapContent, height = dip(20)) {
                    topMargin = dip(50)
                    leftMargin = dip(5)
                    rightMargin = dip(5)
                }
                textView("Number:") {
                    textSize = 15f
                    textColor = ResourcesCompat.getColor(resources, R.color.colorBlack, null)
                }.lparams(width = wrapContent, height = dip(20)) {
                    topMargin = dip(50)
                    leftMargin = dip(15)
                    rightMargin = dip(5)
                }
            }
            linearLayout {
                  numberCode = editText() {
                    textSize = 18f
                    textColor = ResourcesCompat.getColor(resources, R.color.colorBlack, null)
                    backgroundColor = ResourcesCompat.getColor(resources, R.color.colorGrayLight, null)
                    elevation = dip(4).toFloat()
                    leftPadding = dip(2)
                    filters = arrayOf(InputFilter.LengthFilter(4))
                }.lparams(width = dip(50), height = dip(45)) {
                    leftMargin = dip(5)
                    rightMargin = dip(5)
                }
                phoneNumber = editText {
                    textSize = 18f
                    textColor = ResourcesCompat.getColor(resources, R.color.colorBlack, null)
                    inputType = InputType.TYPE_CLASS_NUMBER
                    backgroundColor = ResourcesCompat.getColor(resources, R.color.colorGrayLight, null)
                    elevation = dip(4).toFloat()
                    leftPadding = dip(10)
                }.lparams(width = matchParent, height = dip(45)) {
                    leftMargin = dip(5)
                    rightMargin = dip(5)
                }

            }
                create_account = button("Create Account") {
                    background = ResourcesCompat.getDrawable(resources, R.drawable.button_color_change, null)
                    textColor = ResourcesCompat.getColor(resources, R.color.colorWhite, null)

            }.lparams(width = matchParent, height = dip(45)) {
                gravity = Gravity.CENTER
                topMargin = dip(50)
                leftMargin = dip(5)
                rightMargin = dip(5)
            }
            v=view()
        }
    }
}
