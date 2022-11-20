package com.example.kidney.adapter.Dialisis

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kidney.R
import com.example.kidney.data.Dialisis

class DialisisAdapter(private val dialisisList:List<Dialisis>) : RecyclerView.Adapter<DialisisViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DialisisViewHolder {
        var layoutInflater = LayoutInflater.from(parent.context)
        return DialisisViewHolder(layoutInflater.inflate(R.layout.item_dialisis, parent, false))
    }

    override fun onBindViewHolder(holder: DialisisViewHolder, position: Int) {

        val item = dialisisList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int {
        return dialisisList.size
    }
}