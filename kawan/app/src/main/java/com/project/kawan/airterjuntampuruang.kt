package com.project.kawan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.compose.material.Button
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel

class airterjuntampuruang : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_airterjuntampuruang)
        val btn1 : Button = findViewById(R.id.btn1)
        btn1.setOnClickListener(this)
        val imageSlider = findViewById<ImageSlider>(R.id.imageslider)
        val imageList = ArrayList<SlideModel>()

        imageList.add(SlideModel(R.drawable.airterjuntampuruang1))
        imageList.add(SlideModel(R.drawable.airterjuntampuruang2))
        imageList.add(SlideModel(R.drawable.airterjuntampuruang3))
        imageList.add(SlideModel(R.drawable.airterjuntampuruang4))
        imageList.add(SlideModel(R.drawable.airterjuntampuruang5))

        imageSlider.setImageList(imageList, ScaleTypes.FIT)
    }

    override fun onClick(v: View?) {
        if (v !=null){
            when (v.id){
                R.id.btn1 ->{
                    val pindahIntent = Intent(this,MainActivity::class.java)
                    startActivity(pindahIntent)
                }
            }
        }
    }
}