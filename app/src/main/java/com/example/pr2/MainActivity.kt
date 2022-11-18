package com.example.pr2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val text = "HELLO JAY!"
        val duration = Toast.LENGTH_LONG
        val toast = Toast.makeText(applicationContext,text,
            duration).show()
    }
}
