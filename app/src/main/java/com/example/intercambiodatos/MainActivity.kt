package com.example.intercambiodatos

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.intercambiodatos.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
//    private lateinit var binding = ActivityMainBinding
    private lateinit var binding: ActivityMainBinding // Corregido: variable de binding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        if(savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.main, RegistroFragment())
                .commit()
        }
    }
}