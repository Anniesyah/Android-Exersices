package com.example.myactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val btnResgiter = findViewById<Button>(R.id.btn_register)

        btnResgiter.setOnClickListener {
            val pindah = Intent(this@RegisterActivity, LoginActivity::class.java)
            startActivity(pindah)
        }
    }
}