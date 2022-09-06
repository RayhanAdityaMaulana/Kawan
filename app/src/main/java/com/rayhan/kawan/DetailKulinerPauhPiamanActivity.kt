package com.rayhan.kawan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel

class DetailKulinerPauhPiamanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_kuliner_pauh_piaman)

        val imageSlider = findViewById<ImageSlider>(R.id.imageSlider)
        val imageList = ArrayList<SlideModel>()

        imageList.add(SlideModel(R.drawable.rumahmakanpauhpiaman))
        imageList.add(SlideModel(R.drawable.rumahmakanpauhpiaman1))
        imageList.add(SlideModel(R.drawable.rumahmakanpauhpiaman2))
        imageList.add(SlideModel(R.drawable.rumahmakanpauhpiaman3))

        imageSlider.setImageList(imageList, ScaleTypes.FIT)
    }
}