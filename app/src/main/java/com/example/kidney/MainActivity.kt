package com.example.kidney

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.widget.Button
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val login=findViewById<Button>(R.id.elevatedButton)


       /* var toolbar: Toolbar = findViewById(R.id.main_toolbar)
        toolbar.setTitle("")*/

        login.setOnClickListener {
            val intento1 = Intent(this, AppbarActivity::class.java)
            startActivity(intento1)
        }
    }

}