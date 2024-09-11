package com.example.loginpage

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Telephony.Mms.Intents
import android.text.InputType
import android.widget.Toast
import androidx.core.widget.doAfterTextChanged
import com.example.loginpage.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        with(binding) {
            userName.edittextlayout.hint = "Enter your name"
            password.edittextlayout.hint = "enter your password"
            binding.register.setOnClickListener {
                val intent = Intent(this@MainActivity, resistor::class.java)
                intent.putExtra("name", userName.edittext.text.toString())
                intent.putExtra("password", password.edittext.text.toString())
                startActivity(intent)
                var passwordx: String = " "
                passwordx = "123456"
                var passt = password.edittext.text.toString()
                password.edittext.inputType = InputType.TYPE_TEXT_VARIATION_PASSWORD
                if (passt != passwordx) {
                    register.setOnClickListener {
                        Toast.makeText(this@MainActivity, "invalid password", Toast.LENGTH_SHORT)
                            .show()
                    }
                } else {
                    binding.register.setOnClickListener {
                        val intent = Intent(this@MainActivity, resistor::class.java)
                        startActivity(intent)

                    }
                }
                password.edittext.inputType = InputType.TYPE_TEXT_VARIATION_PASSWORD
                password.edittext.doAfterTextChanged {
                    if (password.edittext.text!!.length < 6) {
                        password.edittext.error = "in valid password"
                    }
                }
            }
        }
    }
}

