package com.example.thingy

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Declare the button
        val btnLogin=findViewById<Button>(R.id.btnLogin)
        val btnHome=findViewById<Button>(R.id.btnHome)

        //Setting the action when button is clicked
        btnLogin?.setOnClickListener{
            val intent= Intent(this,Login::class.java)
            startActivity(intent)
        }
        btnHome?.setOnClickListener{
            val intent= Intent(this,Welcome_Page::class.java)
            startActivity(intent)
        }
    }
}