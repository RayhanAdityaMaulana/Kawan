package com.project.kawan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.SearchView
import android.widget.TextView
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imgprofile: ImageView = findViewById(R.id.imgprofile)
        imgprofile.setOnClickListener(this)
        val lyrsearch: RelativeLayout = findViewById(R.id.lyrsearch)
        lyrsearch.setOnClickListener(this)
        val txtlihatsemua :TextView = findViewById(R.id.txtlihatsemua)
        txtlihatsemua.setOnClickListener(this)
        val txtlihatsemua1 :TextView = findViewById(R.id.txtlihatsemua1)
        txtlihatsemua1.setOnClickListener(this)
        val card1: CardView = findViewById(R.id.card1)
        card1.setOnClickListener(this)
        val card2: CardView = findViewById(R.id.card2)
        card2.setOnClickListener(this)
        val card3: CardView = findViewById(R.id.card3)
        card3.setOnClickListener(this)
        val card4: CardView = findViewById(R.id.card4)
        card4.setOnClickListener(this)
        val card5: CardView = findViewById(R.id.card5)
        card5.setOnClickListener(this)
        val card6 : CardView = findViewById(R.id.card6)
        card6.setOnClickListener(this)
        val card7: CardView = findViewById(R.id.card7)
        card7.setOnClickListener(this)
        val card8: CardView = findViewById(R.id.card8)
        card8.setOnClickListener(this)
        val card9: CardView = findViewById(R.id.card9)
        card9.setOnClickListener(this)
        val card10: CardView = findViewById(R.id.card10)
        card10.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when (v.id) {
                R.id.imgprofile -> {
                    val pindahIntent = Intent(this, ProfilLayoutActivity::class.java)
                    startActivity(pindahIntent)
                }
                R.id.card1 -> {
                    val pindahIntent = Intent(this, airterjuntampuruang::class.java)
                    startActivity(pindahIntent)
                }
                R.id.card2 -> {
                    val pindahIntent = Intent(this, airterjunlubuakrantiang::class.java)
                    startActivity(pindahIntent)
                }
                R.id.card3 -> {
                    val pindahIntent = Intent(this, airterjunlubuakhitam::class.java)
                    startActivity(pindahIntent)
                }
                R.id.card4 -> {
                    val pindahIntent = Intent(this, pulausirandah::class.java)
                    startActivity(pindahIntent)
                }
                R.id.card5 -> {
                    val pindahIntent = Intent(this, bendunganniagara::class.java)
                    startActivity(pindahIntent)
                }
                R.id.lyrsearch -> {
                    val pindahIntent = Intent(this, pencarian1::class.java)
                    startActivity(pindahIntent)
                }
                R.id.txtlihatsemua ->{
                    val pindahIntent = Intent(this, MoreHighlightWisataActivity::class.java)
                    startActivity(pindahIntent)
                }
                R.id.card6 ->{
                    val pindahIntent = Intent(this, DetailKulinerEsDurianIkoGantinyoActivity::class.java)
                    startActivity(pindahIntent)
                }
                R.id.card7 ->{
                    val pindahIntent = Intent(this, DetailKulinerKatupekPitalahActivity::class.java)
                    startActivity(pindahIntent)
                }
                R.id.card8 ->{
                    val pindahIntent = Intent(this, DetailKulinerSateDDActivity::class.java)
                    startActivity(pindahIntent)
                }
                R.id.card9 ->{
                    val pindahIntent = Intent(this, DetailKulinerPauhPiamanActivity::class.java)
                    startActivity(pindahIntent)
                }
                R.id.card10 ->{
                    val pindahIntent = Intent(this, DetailKulinerWarkopNanYoActivity::class.java)
                    startActivity(pindahIntent)
                }
                R.id.txtlihatsemua1 ->{
                    val pindahIntent = Intent(this, More_Hightlight_Kuliner_Activity::class.java)
                    startActivity(pindahIntent)
                }
            }
        }
    }
}