package com.example.a10pahlawanindonesia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class about : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val backToHome: ImageView = findViewById(R.id.back)
        backToHome.setOnClickListener(this)
    }
    override fun onClick(v: View?){
        when (v?.id){
            R.id.back -> {
                val moveIntent = Intent(this@about, MainActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }
}