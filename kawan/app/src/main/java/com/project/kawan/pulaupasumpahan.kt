package com.project.kawan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel

class pulaupasumpahan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pulaupasumpahan)
        val imageSlider = findViewById<ImageSlider>(R.id.imageslider)
        val imageList = ArrayList<SlideModel>()

        imageList.add(SlideModel(R.drawable.paulaupasumpahan1))
        imageList.add(SlideModel(R.drawable.paulaupasumpahan2))
        imageList.add(SlideModel(R.drawable.paulaupasumpahan3))
        imageList.add(SlideModel(R.drawable.paulaupasumpahan4))

        imageSlider.setImageList(imageList, ScaleTypes.FIT)
    }
}