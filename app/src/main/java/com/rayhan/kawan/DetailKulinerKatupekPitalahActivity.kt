package com.rayhan.kawan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel

class DetailKulinerKatupekPitalahActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_kuliner_katupek_pitalah)

        val imageSlider = findViewById<ImageSlider>(R.id.imageSlider)
        val imageList = ArrayList<SlideModel>()

        imageList.add(SlideModel(R.drawable.katupekpitalahpurus3))
        imageList.add(SlideModel(R.drawable.katupekpitalahurus31))
        imageList.add(SlideModel(R.drawable.katupekpitalahurus32))
        imageList.add(SlideModel(R.drawable.katupekpitalahurus33))

        imageSlider.setImageList(imageList, ScaleTypes.FIT)
    }
}