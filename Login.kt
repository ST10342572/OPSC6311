package com.example.thingy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnSignUp=findViewById<Button>(R.id.btnSignUp)
        val btnCancel=findViewById<Button>(R.id.btnCancel)

        btnSignUp?.setOnClickListener{
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        btnCancel?.setOnClickListener{
            val intent= Intent(this,Welcome_Page::class.java)
            startActivity(intent)
        }
    }
}