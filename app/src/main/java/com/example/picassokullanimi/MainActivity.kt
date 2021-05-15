package com.example.picassokullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonResim1.setOnClickListener {
            val url = "http://kasimadalan.pe.hu/filmler/resimler/django.png"
            Picasso.get().load(url).into(imageView)
        }

        buttonResim2.setOnClickListener {
            val url = "http://kasimadalan.pe.hu/filmler/resimler/interstellar.png"
            Picasso.get().load(url).into(imageView)
        }

    }
}