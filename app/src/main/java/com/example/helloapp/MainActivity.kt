package com.example.helloapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

const val EXTRA_USER_NAME = "com.example.helloapp.USER_NAME"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendName(view: View) {
        val editText = findViewById<EditText>(R.id.editText)
        val name = editText.text.toString()
        // とりあえず intent経由で表示する名前を渡す
        val intent = Intent(this, DisplayNameActivity::class.java).apply {
            putExtra(EXTRA_USER_NAME, name)
        }
        startActivity(intent)
    }
}
