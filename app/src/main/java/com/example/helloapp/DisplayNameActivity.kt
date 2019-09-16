package com.example.helloapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayNameActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_name)

        val name = intent.getStringExtra(EXTRA_USER_NAME)

        val textView = findViewById<TextView>(R.id.textViewName).apply {
            text = name
        }
    }
}
