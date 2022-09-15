package com.project.kawan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel

class masjidrayasumbar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_masjidrayasumbar)
        val imageSlider = findViewById<ImageSlider>(R.id.imageslider)
        val imageList = ArrayList<SlideModel>()

        imageList.add(SlideModel(R.drawable.masjidraya1))
        imageList.add(SlideModel(R.drawable.masjidraya2))
        imageList.add(SlideModel(R.drawable.masjidraya3))
        imageList.add(SlideModel(R.drawable.masjidraya4))
        imageList.add(SlideModel(R.drawable.masjidraya5))

        imageSlider.setImageList(imageList, ScaleTypes.FIT)
    }
}