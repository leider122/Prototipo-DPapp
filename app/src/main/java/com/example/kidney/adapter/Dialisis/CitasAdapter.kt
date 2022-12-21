package com.example.kidney.adapter.Dialisis

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kidney.R
import com.example.kidney.data.Citas

class CitasAdapter (private val citasList:List<Citas>) : RecyclerView.Adapter<CitasViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CitasViewHolder {
        var layoutInflater = LayoutInflater.from(parent.context)
        return CitasViewHolder(
            layoutInflater.inflate(
                R.layout.item_citas,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: CitasViewHolder, position: Int) {

        val item = citasList[position]
        println(item.titulo)
        holder.render(item)
    }

    override fun getItemCount(): Int {

        return citasList.size
    }
}