package com.project.kawan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class ForgotPassword1Activity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password1)
        val btn_back_forgot1: ImageView = findViewById(R.id.btn_back_forgot1)
        btn_back_forgot1.setOnClickListener(this)
        val btnForgot1: Button = findViewById(R.id.btnForgot1)
        btnForgot1.setOnClickListener(this)
    }
    override fun onClick(v: View?) {
        if (v !=null){
            when (v.id){
                R.id.btnForgot1->{
                    val pindahIntent = Intent(this,ForgotPassword2Activity::class.java)
                    startActivity(pindahIntent)
                }
                R.id.btn_back_forgot1->{
                    val pindahIntent = Intent(this,LoginActivity::class.java)
                    startActivity(pindahIntent)
                }
            }
        }
    }
}