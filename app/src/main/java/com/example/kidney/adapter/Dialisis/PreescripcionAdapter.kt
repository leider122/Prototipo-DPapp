package com.example.kidney.adapter.Dialisis

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kidney.R
import com.example.kidney.data.Preescripcion

class PreescripcionAdapter(private val preescripcionesList:List<Preescripcion>): RecyclerView.Adapter<PreescripcionViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PreescripcionViewHolder {
        var layoutInflater = LayoutInflater.from(parent.context)
        return PreescripcionViewHolder(layoutInflater.inflate(R.layout.item_preescripcion, parent, false))
    }

    override fun onBindViewHolder(holder: PreescripcionViewHolder, position: Int) {

        val item = preescripcionesList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int {
        return preescripcionesList.size
    }
}