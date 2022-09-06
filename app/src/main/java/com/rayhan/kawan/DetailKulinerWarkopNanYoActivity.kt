package com.rayhan.kawan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel

class DetailKulinerWarkopNanYoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_kuliner_warkop_nan_yo)

        val imageSlider = findViewById<ImageSlider>(R.id.imageSlider)
        val imageList = ArrayList<SlideModel>()

        imageList.add(SlideModel(R.drawable.warungkopinanyo))
        imageList.add(SlideModel(R.drawable.warungkopinanyo2))
        imageList.add(SlideModel(R.drawable.warungkopinanyo1))
        imageList.add(SlideModel(R.drawable.warungkopinanyo3))

        imageSlider.setImageList(imageList, ScaleTypes.FIT)
    }
}