package com.riz3nd.androidyaunidad1.modulo1

import android.app.Activity
import android.view.View
import android.widget.*
import com.riz3nd.androidyaunidad1.R

class CapturarBtnClick (activity: Activity){
    private var btn: Button
    private var et_num1: EditText
    private var et_num2: EditText
    private var rb_suma: RadioButton
    private var rb_resta: RadioButton
    private var radio_group: RadioGroup
    private var Spinner: Spinner
    private var mActivity: Activity = activity
    private var mainLinear: LinearLayout

    init {
        btn = mActivity.findViewById(R.id.btn)
        et_num1 = mActivity.findViewById(R.id.et_num1)
        et_num2 = mActivity.findViewById(R.id.et_num2)
        rb_suma = mActivity.findViewById(R.id.rb_suma)
        rb_resta = mActivity.findViewById(R.id.rb_resta)
        Spinner = mActivity.findViewById(R.id.sp_op)
        radio_group = mActivity.findViewById(R.id.radio_goup)
        mainLinear = mActivity.findViewById(R.id.main_linear)
        mainLinear.visibility = View.VISIBLE
    }

    fun ButttonClickSpinner(){
        Spinner.visibility = View.VISIBLE
        val opciones_lv = arrayOf("Sumar","Restar","Multiplicar","Dividir")
        val adapterSpinner = ArrayAdapter<String>(mActivity,android.R.layout.simple_list_item_1, opciones_lv)
        Spinner.adapter = adapterSpinner
        var res = ""
        btn.setOnClickListener {
            when(Spinner.selectedItem.toString()){
                "Sumar" -> res = "La suma es: ${(et_num1.text.toString().toIntOrNull() ?: 0) + (et_num2.text.toString().toIntOrNull() ?: 0)}"
                "Restar" -> res = "La resta es: ${(et_num1.text.toString().toIntOrNull() ?: 0) - (et_num2.text.toString().toIntOrNull() ?: 0)}"
                "Multiplicar" -> res = "La Multiplicacion es: ${(et_num1.text.toString().toIntOrNull() ?: 0) * (et_num2.text.toString().toIntOrNull() ?: 0)}"
                "Dividir" -> res = "La Division es: ${(et_num1.text.toString().toIntOrNull() ?: 0) / (et_num2.text.toString().toIntOrNull() ?: 1)}"
            }
            Toast.makeText(mActivity,res, Toast.LENGTH_LONG).show()
        }
    }

    fun ButttonClickRadioButton(){
        radio_group.visibility = View.VISIBLE
        var res = ""
        btn.setOnClickListener {
            if (rb_suma.isChecked)
                res = "La suma es: ${(et_num1.text.toString().toIntOrNull() ?: 0)+(et_num2.text.toString().toIntOrNull() ?: 0)}"
            if (rb_suma.isChecked)
                res = "La resta es: ${(et_num1.text.toString().toIntOrNull() ?: 0)-(et_num2.text.toString().toIntOrNull() ?: 0)}"
            if (!rb_suma.isChecked && !rb_resta.isChecked)
                res  = "Seleccione una opcion"
            Toast.makeText(mActivity,res, Toast.LENGTH_LONG).show()
        }
    }

}