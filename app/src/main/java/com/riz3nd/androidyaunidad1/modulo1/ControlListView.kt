package com.riz3nd.androidyaunidad1.modulo1

import android.app.Activity
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import com.riz3nd.androidyaunidad1.R

class ControlListView(activity: Activity) {
    private var lv_paises: ListView
    private val mActivity: Activity = activity
    init {
        lv_paises  = mActivity.findViewById(R.id.lv_paises)
        lv_paises.visibility = View.VISIBLE
    }

    fun mostratListView(){
        val paises = arrayOf("Colombia","Chile","Argentina","Brazil","Peru","Ecuador","Paraguay","Uruguay","Bolivia","Venezuela")
        val adatador = ArrayAdapter<String>(mActivity, android.R.layout.simple_list_item_1, paises)
        lv_paises.adapter = adatador
        lv_paises.setOnItemClickListener { adapterView, view, i, l -> Toast.makeText(mActivity,"Ha seleccionado ${paises[i]}",Toast.LENGTH_LONG).show() }
    }

}