package com.example.kidney.adapter.Dialisis

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kidney.R
import com.example.kidney.data.Alimentacion
import com.example.kidney.data.Dialisis

class AlimentacionViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val alimentacion = view.findViewById<TextView>(R.id.tvAlimentacionTitulo)
    val img = view.findViewById<ImageView>(R.id.ivAlimentacion)

    fun render(alimentacionModel: Alimentacion){
        alimentacion.text = alimentacionModel.titulo

    }
}