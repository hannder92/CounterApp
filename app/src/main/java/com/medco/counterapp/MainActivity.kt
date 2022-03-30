package com.medco.counterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMyButton = findViewById<Button>(R.id.myButton)
        val tvMyText = findViewById<TextView>(R.id.myText)
        var timesClicked = 0
        btnMyButton.setOnClickListener {
            timesClicked += 1
            tvMyText.text = "Counter: $timesClicked"
            Toast.makeText(this, "Hey I'm a Toast!", Toast.LENGTH_LONG).show()
        }

    }
}