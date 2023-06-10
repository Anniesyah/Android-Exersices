package com.example.myactivity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_EMAIL = "extra_email"
        const val EXTRA_PASSWORD = "extra_password"


    }
    private lateinit var navController: NavController
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var appBarConfiguration: AppBarConfiguration

    private lateinit var listener:NavController.OnDestinationChangedListener

      @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        navController = findNavController(R.id.fragment)
        drawerLayout = findViewById(R.id.drawer_layout)
        appBarConfiguration = AppBarConfiguration(navController.graph, drawerLayout)


        setupActionBarWithNavController(navController,appBarConfiguration)


        val tv_hasil = findViewById<TextView>(R.id.tv_hasil)

        val email = intent.getStringExtra(EXTRA_EMAIL)
        val password = intent.getStringExtra(EXTRA_PASSWORD)

        val hasil = "Email : $email \nPassword : $password"
        tv_hasil.text= hasil

        val bottomNavigationView= findViewById<BottomNavigationView>(R.id.bottomView)
        val navController = findNavController(R.id.fragment)

        bottomNavigationView.setupWithNavController(navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.fragment)
        return navController.navigateUp(appBarConfiguration)
                || super.onSupportNavigateUp()


    }
}
}

