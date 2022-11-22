package com.example.kidney

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kidney.adapter.Dialisis.DialisisAdapter
import com.google.android.material.navigation.NavigationView

class DialisisActivity : AppCompatActivity() {
//    lateinit var toggle : ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dialisis)

//        val drawerLayout = findViewById<DrawerLayout>(R.layout.activity_appbar)
//        val navView = findViewById<NavigationView>(R.id.navView)
//
//        toggle = ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close)
//        drawerLayout.addDrawerListener(toggle)
//        toggle.syncState()
//
//        supportActionBar?.setDisplayHomeAsUpEnabled(true)
//
//        navView.setNavigationItemSelectedListener {
//            when(it.itemId){
//                R.id.misDialisis -> {
//                    //como fragment o activities??????????
//                    val intento1 = Intent(this, DialisisActivity::class.java)
//                    startActivity(intento1)
//                }
//
//                R.id.misCitas -> Toast.makeText(applicationContext, "clicked mis citas", Toast.LENGTH_SHORT).show()
//
//            }
//            true
//        }

        initRecyclerView()


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