package com.rayhan.kawan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel

class DetailKulinerEsDurianIkoGantinyoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_kuliner_es_durian_iko_gantinyo)

        val imageSlider = findViewById<ImageSlider>(R.id.imageSlider)
        val imageList = ArrayList<SlideModel>()

        imageList.add(SlideModel(R.drawable.esdurianikogantinyo))
        imageList.add(SlideModel(R.drawable.esdurianikogantinyo1))
        imageList.add(SlideModel(R.drawable.esdurianikogantinyo2))

        imageSlider.setImageList(imageList, ScaleTypes.FIT)
    }
}