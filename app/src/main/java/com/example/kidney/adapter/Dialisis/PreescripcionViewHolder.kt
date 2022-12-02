package com.example.kidney.adapter.Dialisis

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kidney.R
import com.example.kidney.data.Preescripcion

class PreescripcionViewHolder(view: View) : RecyclerView.ViewHolder(view)  {

    val preescripcion = view.findViewById<TextView>(R.id.ivPreescripcion)

    fun render(preescripcionModelo: Preescripcion){
        preescripcion.text = preescripcionModelo.titulo

    }

}