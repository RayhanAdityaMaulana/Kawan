package com.project.kawan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.LinearLayout
import androidx.appcompat.view.menu.ExpandedMenuView
import androidx.cardview.widget.CardView
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.ms.square.android.expandabletextview.ExpandableTextView

class pulausirandah : AppCompatActivity(), View.OnClickListener {
    private lateinit var expandBtn: ImageButton
    private lateinit var expandBtn2: ImageButton
    private lateinit var expandcard: LinearLayout
    private lateinit var expandcard1: LinearLayout
    private lateinit var expandbtn1: ImageButton
    private lateinit var expandbtn2: ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pulausirandah)
        val btn5 : Button = findViewById(R.id.btn5)
        btn5.setOnClickListener(this)
        expandBtn = findViewById(R.id.expandBtn)
        expandBtn2 = findViewById(R.id.expandBtn2)
        expandcard1 = findViewById(R.id.expandcard1)
        expandcard = findViewById(R.id.expandcard)
        expandbtn1 = findViewById(R.id.expandbtn1)
        expandbtn2 = findViewById(R.id.expandbtn2)
        val imageSlider = findViewById<ImageSlider>(R.id.imageslider)
        val imageList = ArrayList<SlideModel>()

        imageList.add(SlideModel(R.drawable.sirandah1))
        imageList.add(SlideModel(R.drawable.sirandah2))
        imageList.add(SlideModel(R.drawable.sirandah3))
        imageList.add(SlideModel(R.drawable.sirandah4))
        imageList.add(SlideModel(R.drawable.sirandah5))
        imageSlider.setImageList(imageList, ScaleTypes.FIT)

        expandBtn.setOnClickListener {
            if (expandcard.visibility == View.GONE) {
                expandcard.visibility = View.VISIBLE
                expandBtn.setImageResource(R.drawable.ic_baseline_keyboard_arrow_up_24)
            } else {
                expandcard.visibility = View.GONE
                expandBtn.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24)
            }
        }
        expandbtn1.setOnClickListener {
            if (expandcard.visibility == View.GONE) {
                expandcard.visibility = View.VISIBLE
                expandBtn.setImageResource(R.drawable.ic_baseline_keyboard_arrow_up_24)
            } else {
                expandcard.visibility = View.GONE
                expandBtn.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24)
            }
        }

        expandBtn2.setOnClickListener {
            if (expandcard1.visibility == View.GONE) {
                expandcard1.visibility = View.VISIBLE
                expandBtn2.setImageResource(R.drawable.ic_baseline_keyboard_arrow_up_24)
            } else {
                expandcard1.visibility = View.GONE
                expandBtn2.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24)
            }
        }

        expandbtn2.setOnClickListener {
            if (expandcard1.visibility == View.GONE) {
                expandcard1.visibility = View.VISIBLE
                expandBtn2.setImageResource(R.drawable.ic_baseline_keyboard_arrow_up_24)
            } else {
                expandcard1.visibility = View.GONE
                expandBtn2.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24)
            }
        }

        }
    override fun onClick(v: View?) {
        if (v !=null){
            when (v.id){
                R.id.btn5 ->{
                    val pindahIntent = Intent(this,MainActivity::class.java)
                    startActivity(pindahIntent)
                }
            }
        }
    }
    }