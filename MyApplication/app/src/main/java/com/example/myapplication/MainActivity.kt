package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var showButton: Button
    private lateinit var editText: EditText
    private lateinit var name: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         editText = findViewById(R.id.et_name)
         name = findViewById(R.id.tv_name)
         showButton = findViewById(R.id.button)

        showName()
    }

    private fun showName(){
        showButton.setOnClickListener {
            val nameTyped = editText.text.toString()
            name.text = nameTyped
        }
    }


}