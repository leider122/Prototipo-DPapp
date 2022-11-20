package com.example.kidney.adapter.Dialisis

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kidney.R
import com.example.kidney.data.Dialisis

class DialisisViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val dialisis = view.findViewById<TextView>(R.id.tvDialisisTitulo)
    val descripcion = view.findViewById<TextView>(R.id.tvDialisisDescripcion)
    val img = view.findViewById<ImageView>(R.id.ivDialisis)

    fun render(dialisisModel: Dialisis){
        dialisis.text = dialisisModel.titulo
        descripcion.text = dialisisModel.descripcion

    }
}