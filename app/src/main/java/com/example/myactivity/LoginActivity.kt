package com.example.myactivity

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class LoginActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val email = findViewById<EditText>(R.id.et_login_email)
        val password = findViewById<EditText>(R.id.ed_login_password)
        val moveToHome = findViewById<Button>(R.id.btn_login)

        moveToHome.setOnClickListener {
            val kirim_data = Intent(this@LoginActivity, MainActivity::class.java)
            kirim_data.putExtra(MainActivity.EXTRA_EMAIL, email.text.toString())
            kirim_data.putExtra(MainActivity.EXTRA_PASSWORD, password.text.toString())

            startActivity(kirim_data)
        }
    }
}