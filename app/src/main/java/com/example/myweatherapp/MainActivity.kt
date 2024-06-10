package com.example.myweatherapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navigateButton: Button = findViewById(R.id.joose)
        val clearButton: Button = findViewById(R.id.button_clear)

        navigateButton.setOnClickListener {
            val intent = Intent(this@MainActivity, DetailedViewActivity::class.java)
            startActivity(intent)
        }

        clearButton.setOnClickListener {
            // Logic to clear the input data


        }
    }
         }