package com.project.kawan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel

class DetailKulinerSateDDActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_kuliner_satedd)
        val btnBack : Button = findViewById(R.id.btnBack)
        btnBack.setOnClickListener(this)
        val imageSlider = findViewById<ImageSlider>(R.id.imageSlider)
        val imageList = ArrayList<SlideModel>()

        imageList.add(SlideModel(R.drawable.satedanguangdanguangsimpangkinolpondok))
        imageList.add(SlideModel(R.drawable.satedanguangdanguangsimpangkinolpondok1))
        imageList.add(SlideModel(R.drawable.satedanguangdanguangsimpangkinolpondok2))

        imageSlider.setImageList(imageList, ScaleTypes.FIT)
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