package com.project.kawan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel

class airterjunlubuakhitam : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_airterjunlubuakhitam)
        val btn3 : Button = findViewById(R.id.btn3)
        btn3.setOnClickListener(this)
        val imageSlider = findViewById<ImageSlider>(R.id.imageslider)
        val imageList = ArrayList<SlideModel>()

        imageList.add(SlideModel(R.drawable.lubuakhitam1))
        imageList.add(SlideModel(R.drawable.lubuakhitam2))
        imageList.add(SlideModel(R.drawable.lubuakhitam3))
        imageList.add(SlideModel(R.drawable.lubuakhitam4))
        imageList.add(SlideModel(R.drawable.lubuakhitam5))

        imageSlider.setImageList(imageList, ScaleTypes.FIT)
    }

    override fun onClick(v: View?) {
        if (v !=null){
            when (v.id){
                R.id.btn3 ->{
                    val pindahIntent = Intent(this,MainActivity::class.java)
                    startActivity(pindahIntent)
                }
            }
        }
    }
}