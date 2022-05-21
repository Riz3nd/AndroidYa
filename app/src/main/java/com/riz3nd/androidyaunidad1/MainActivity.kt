package com.riz3nd.androidyaunidad1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.riz3nd.androidyaunidad1.modulo1.CapturarBtnClick
import com.riz3nd.androidyaunidad1.modulo1.ControlListView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val clickbtn = CapturarBtnClick(this)
//        clickbtn.ButttonClickRadioButton()
        val controlListenerView = ControlListView(this)
        controlListenerView.mostratListView()
    }
}