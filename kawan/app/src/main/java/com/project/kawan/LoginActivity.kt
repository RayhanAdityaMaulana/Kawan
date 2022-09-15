package com.project.kawan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class LoginActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val btnLogin : Button = findViewById(R.id.btnLogin)
        btnLogin.setOnClickListener(this)
        val tv_daftar : TextView = findViewById(R.id.tv_daftar)
        tv_daftar.setOnClickListener(this)
        val forgot : TextView = findViewById(R.id.forgot)
        forgot.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v !=null){
            when (v.id){
                R.id.btnLogin ->{
                    val pindahIntent = Intent(this,MainActivity::class.java)
                    startActivity(pindahIntent)
                }
                R.id.tv_daftar ->{
                    val pindahIntent = Intent(this,RegisterActivity::class.java)
                    startActivity(pindahIntent)
                }
                R.id.forgot ->{
                    val pindahIntent = Intent(this,ForgotPassword1Activity::class.java)
                    startActivity(pindahIntent)
                }
            }
        }
    }
}