package com.example.myactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myactivity.ui.main.MainActivity3Fragment

class MainActivity3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activity3)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainActivity3Fragment.newInstance())
                .commitNow()
        }
    }
}