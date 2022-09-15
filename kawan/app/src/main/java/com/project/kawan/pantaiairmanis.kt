package com.project.kawan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel

class pantaiairmanis : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantaiairmanis)
        val imageSlider = findViewById<ImageSlider>(R.id.imageslider)
        val imageList = ArrayList<SlideModel>()

        imageList.add(SlideModel(R.drawable.pantaiairmanis1))
        imageList.add(SlideModel(R.drawable.pantaiairmanis2))
        imageList.add(SlideModel(R.drawable.pantaiairmanis3))
        imageList.add(SlideModel(R.drawable.pantaiairmanis4))
        imageList.add(SlideModel(R.drawable.pantaiairmanis5))

        imageSlider.setImageList(imageList, ScaleTypes.FIT)
    }
}