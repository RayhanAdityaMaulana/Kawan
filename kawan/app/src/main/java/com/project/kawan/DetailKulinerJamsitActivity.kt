package com.project.kawan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel

class DetailKulinerJamsitActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_kuliner_jamsit)

        val imageSlider = findViewById<ImageSlider>(R.id.imageSlider)
        val imageList = ArrayList<SlideModel>()

        imageList.add(SlideModel(R.drawable.kulinerjamsit))
        imageList.add(SlideModel(R.drawable.kulinerjamsit1))
        imageList.add(SlideModel(R.drawable.kulinerjamsit2))
        imageList.add(SlideModel(R.drawable.kulinerjamsit3))

        imageSlider.setImageList(imageList, ScaleTypes.FIT)
    }
}