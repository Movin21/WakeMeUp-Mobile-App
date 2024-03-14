package com.example.wakemeup

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_user_onboarding)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun signUpbtn(view: View) {
        Toast.makeText(this, "Welcome To WakeMeUp", Toast.LENGTH_SHORT).show()
        val intent = Intent(this, Signup::class.java)
        startActivity(intent)
        finish()
    }
    fun signInbtn(view: View) {
        Toast.makeText(this, "Welcome Back", Toast.LENGTH_SHORT).show()
        val intent = Intent(this, SignIn::class.java)
        startActivity(intent)
        finish()
    }

}