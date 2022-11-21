package com.example.kidney

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kidney.adapter.Dialisis.DialisisAdapter

class MainActivity : AppCompatActivity() {



    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val login=findViewById<Button>(R.id.elevatedButton)

        login.setOnClickListener {
            val intento1 = Intent(this, DialisisActivity::class.java)
            startActivity(intento1)
        }
    }




}