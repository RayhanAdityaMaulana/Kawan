package com.rayhan.kawan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.Slide
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel

class DetailKulinerEsDurianGantiNanLamoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_kuliner_es_durian_ganti_nan_lamo)

        val imageSlider = findViewById<ImageSlider>(R.id.imageSlider)
        val imageList = ArrayList<SlideModel>()

        imageList.add(SlideModel(R.drawable.d_gantinanlamo1_x4))
        imageList.add(SlideModel(R.drawable.d_gantinanlamo2_x4))
        imageList.add(SlideModel(R.drawable.d_gantinanlamo3_x4))


        imageSlider.setImageList(imageList, ScaleTypes.FIT)
    }
}