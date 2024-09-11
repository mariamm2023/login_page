package com.example.loginpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.loginpage.databinding.ActivityMainBinding
import com.example.loginpage.databinding.ActivityResistorBinding

class resistor : AppCompatActivity() {
    private val binding by lazy {
        ActivityResistorBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val name1=intent.getStringExtra("name")
        val password1=intent.getStringExtra("password")
        with(binding) {
            text1.text="Welcome $name1 " +"password is $password1"

        }
    }
}