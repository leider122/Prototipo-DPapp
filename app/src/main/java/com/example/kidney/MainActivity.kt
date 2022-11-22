package com.example.kidney

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val login=findViewById<Button>(R.id.elevatedButton)

        auth = FirebaseAuth.getInstance()
        val usuario: EditText =findViewById(R.id.email)
        val clave: EditText =findViewById(R.id.password)
        val iniciar: Button =findViewById(R.id.elevatedButton)

        iniciar.setOnClickListener(){
            sinIng(usuario.text.toString(),clave.text.toString())
        }
       /* var toolbar: Toolbar = findViewById(R.id.main_toolbar)
        toolbar.setTitle("")*/
//
//        login.setOnClickListener {
//            val intento1 = Intent(this, AppbarActivity::class.java)
//            startActivity(intento1)
//        }
    }

    public override fun onStart() {
        super.onStart()
        // Check if user is signed in (non-null) and update UI accordingly.
        val currentUser = auth.currentUser
        if(currentUser != null){
            //reload();
        }
    }

    fun sinIng(email:String, password:String){
        val TAG:String = "MainActivity"
        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    // Sign in success, update UI with the signed-in user's information
                    Toast.makeText(baseContext, "Authentication Exitosa.",
                        Toast.LENGTH_SHORT).show()
                    Log.d(TAG, "signInWithEmail:success")
                    val user = auth.currentUser
                    irInicio()
                    //updateUI(user)
                } else {
                    // If sign in fails, display a message to the user.
                    Log.w(TAG, "signInWithEmail:failure", task.exception)
                    Toast.makeText(baseContext, "Authentication failed.",
                        Toast.LENGTH_SHORT).show()
                    //updateUI(null)
                }
            }
    }

    fun irInicio() {
        val intent = Intent(this, AppbarActivity::class.java)
        startActivity(intent)
    }

}