package com.example.firstquizdavitosadze

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.RegisterButton).setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }
    }
}