package com.project.kawan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel

class bendunganniagara : AppCompatActivity(),View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bendunganniagara)
        val imageSlider = findViewById<ImageSlider>(R.id.imageslider)
        val imageList = ArrayList<SlideModel>()
        val btn4 : Button = findViewById(R.id.btn4)
        btn4.setOnClickListener(this)

        imageList.add(SlideModel(R.drawable.bendunganniagara1))
        imageList.add(SlideModel(R.drawable.bendunganniagara2))
        imageList.add(SlideModel(R.drawable.bendunganniagara3))
        imageList.add(SlideModel(R.drawable.bendunganniagara4))

        imageSlider.setImageList(imageList, ScaleTypes.FIT)
    }
    override fun onClick(v: View?) {
        if (v !=null){
            when (v.id){
                R.id.btn4 ->{
                    val pindahIntent = Intent(this,MainActivity::class.java)
                    startActivity(pindahIntent)
                }
            }
        }
    }
}