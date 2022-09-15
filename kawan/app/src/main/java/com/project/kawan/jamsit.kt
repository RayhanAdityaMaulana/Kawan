package com.project.kawan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel

class jamsit : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jamsit)
        val imageSlider = findViewById<ImageSlider>(R.id.imageslider)
        val imageList = ArrayList<SlideModel>()

        imageList.add(SlideModel(R.drawable.jamsit1))
        imageList.add(SlideModel(R.drawable.jamsit2))
        imageList.add(SlideModel(R.drawable.jamsit3))
        imageList.add(SlideModel(R.drawable.jamsit4))
        imageList.add(SlideModel(R.drawable.jamsit5))

        imageSlider.setImageList(imageList, ScaleTypes.FIT)
    }
}