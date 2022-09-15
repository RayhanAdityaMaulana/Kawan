package com.project.kawan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class MoreHighlightWisataActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_more_highlight_wisata)
        val btnBack : ImageView = findViewById(R.id.btnBack)
        btnBack.setOnClickListener(this)
    }
    override fun onClick(v: View?) {
        if (v !=null){
            when (v.id){
                R.id.btnBack ->{
                    val pindahIntent = Intent(this,MainActivity::class.java)
                    startActivity(pindahIntent)
                }
            }
        }
    }
}