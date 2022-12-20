package com.example.kidney.adapter.Dialisis

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kidney.AlimentacionProvider.Companion.alimentacionList
import com.example.kidney.R
import com.example.kidney.data.Alimentacion
import com.example.kidney.data.Dialisis

class AlimentacionAdapter (private val alimentacionList:List<Alimentacion>) : RecyclerView.Adapter<AlimentacionViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlimentacionViewHolder {
        var layoutInflater = LayoutInflater.from(parent.context)
        return AlimentacionViewHolder(layoutInflater.inflate(R.layout.item_alimentacion, parent, false))
    }

    override fun onBindViewHolder(holder: AlimentacionViewHolder, position: Int) {

        val item = alimentacionList[position]
        println(item.titulo)
        holder.render(item)
    }

    override fun getItemCount(): Int {

        return alimentacionList.size
    }
}