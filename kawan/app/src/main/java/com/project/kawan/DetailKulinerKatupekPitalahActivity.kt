package com.project.kawan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel

class DetailKulinerKatupekPitalahActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_kuliner_katupek_pitalah)
        val btnBack : Button = findViewById(R.id.btnBack)
        btnBack.setOnClickListener(this)
        val imageSlider = findViewById<ImageSlider>(R.id.imageSlider)
        val imageList = ArrayList<SlideModel>()

        imageList.add(SlideModel(R.drawable.katupekpitalahpurus3))
        imageList.add(SlideModel(R.drawable.katupekpitalahurus31))
        imageList.add(SlideModel(R.drawable.katupekpitalahurus32))
        imageList.add(SlideModel(R.drawable.katupekpitalahurus33))

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