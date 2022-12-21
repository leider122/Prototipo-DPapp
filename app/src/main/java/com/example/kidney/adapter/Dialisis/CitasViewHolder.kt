package com.example.kidney.adapter.Dialisis

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kidney.R
import com.example.kidney.data.Citas

class CitasViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val citas = view.findViewById<TextView>(R.id.tvCitasTitulo)
    val img = view.findViewById<ImageView>(R.id.ivCitas)

    fun render(citasModel: Citas){
        citas.text = citasModel.titulo

    }
}