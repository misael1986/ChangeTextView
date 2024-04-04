package com.example.changetextview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)

        val textView = findViewById<TextView>(R.id.textView)

        var contador=0;

        button.setOnClickListener{
            contador++;
            textView.text=contador.toString()
        }

    }
}