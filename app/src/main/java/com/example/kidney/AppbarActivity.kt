package com.example.kidney

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.navigation.NavigationView

class AppbarActivity : AppCompatActivity(){

    lateinit var toggle : ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_appbar)

        val drawerLayout = findViewById<DrawerLayout>(R.id.drawerLayout)
        val navView = findViewById<NavigationView>(R.id.navView)

        toggle = ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navView.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.misDialisis -> {
                    val transaccion : FragmentTransaction = supportFragmentManager.beginTransaction()
                    val nuevoFragmento:Fragment  = DialisisFragment()
                    transaccion.replace(R.id.container, nuevoFragmento)
                    transaccion.commit()
                    drawerLayout.close()
                }

                R.id.alimentacion -> {
                    val transaccion : FragmentTransaction = supportFragmentManager.beginTransaction()
                    val nuevoFragmento:Fragment  = AlimentacionFragment()
                    transaccion.replace(R.id.container, nuevoFragmento)
                    transaccion.commit()
                    drawerLayout.close()
                }

                R.id.misCitas -> Toast.makeText(applicationContext, "clicked mis citas", Toast.LENGTH_SHORT).show()

            }
            true
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}