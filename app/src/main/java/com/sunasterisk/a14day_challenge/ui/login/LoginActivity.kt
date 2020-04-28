package com.sunasterisk.a14day_challenge.ui.login

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sunasterisk.a14day_challenge.R

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    companion object{
        fun getIntent(context: Context): Intent {
            val intent = Intent(context, LoginActivity::class.java)
            return intent
        }
    }
}
