package com.project.kawan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class pencarian1 : AppCompatActivity(),View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pencarian1)
        val img1 : ImageView=findViewById(R.id.img1)
        img1.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v !=null){
            when (v.id){
                R.id.img1 ->{
                    val pindahIntent = Intent(this,MainActivity::class.java)
                    startActivity(pindahIntent)
                }
            }
        }
    }
}