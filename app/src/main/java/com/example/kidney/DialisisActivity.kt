package com.example.kidney

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kidney.adapter.Dialisis.DialisisAdapter

class DialisisActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dialisis)

        initRecyclerView()
       /* var toolbar: Toolbar = findViewById(R.id.main_toolbar)
        toolbar.setTitle("")


        setSupportActionBar(findViewById(R.id.main_toolbar))*/
    }

    private fun initRecyclerView(){
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerDialisis)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = DialisisAdapter(DialisisProvider.dialisisList)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {
            R.id.more -> Toast.makeText(this, "hola", Toast.LENGTH_SHORT ).show()
            2 -> print("x == 2")
            else -> { // Note the block
                print("x no es 1 o 2")
            }
        }

        return super.onOptionsItemSelected(item)
    }
}