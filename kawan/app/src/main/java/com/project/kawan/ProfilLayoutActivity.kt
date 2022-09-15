package com.project.kawan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.cardview.widget.CardView

class ProfilLayoutActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil_layout)
        val btn_back_profil: ImageView = findViewById(R.id.btn_back_profil)
        btn_back_profil.setOnClickListener(this)
    }
    override fun onClick(v: View?) {
        if (v != null) {
            when (v.id) {
                R.id.btn_back_profil -> {
                    val pindahIntent = Intent(this, MainActivity::class.java)
                    startActivity(pindahIntent)
                }
            }
        }
    }
}