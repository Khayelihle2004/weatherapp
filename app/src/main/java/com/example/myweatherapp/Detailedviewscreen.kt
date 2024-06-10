package com.example.myweatherapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailedViewActivity : AppCompatActivity() {

    private lateinit var detailedInfo: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailedviewscreen)

        detailedInfo = findViewById(R.id.detailed_info)
        // Add code here to display the detailed information and calculate average screen time
    }


    }
