package com.example.layoutapp

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // This line should reference your XML layout

        val myButton= findViewById<Button>(R.id.button)

        myButton.setOnClickListener {
            Log.d("MainActivity", "Button clicked!")
        }
    }

}
