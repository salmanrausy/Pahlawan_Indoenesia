package com.example.a10pahlawanindonesia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val dataPresident = intent.getParcelableExtra<President>("key_president") as President

        val tvDetailName: TextView = findViewById(R.id.tv_detail_name)
        val tvNamaNegara: TextView = findViewById(R.id.Edt_Nama_Negara)
        val tvPeriodeMenjabat: TextView = findViewById(R.id.Edt_Periode_Menjabat)
        val tvDetailDescription: TextView = findViewById(R.id.tv_detail_description)
        val ivDetailPhoto: ImageView = findViewById(R.id.iv_detail_photo)

        tvDetailName.text = dataPresident.name
        tvNamaNegara.text = dataPresident.country
        tvPeriodeMenjabat.text = dataPresident.periode
        tvDetailDescription.text = dataPresident.description
        ivDetailPhoto.setImageResource(dataPresident.photo)

        val backToHome: ImageView = findViewById(R.id.back)
        backToHome.setOnClickListener(this)
    }

    override fun onClick(v: View?){
        when (v?.id){
            R.id.back -> {
                val moveIntent = Intent(this@DetailActivity, MainActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }
}