package com.ipedraza.randomimages

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.lifecycle.ViewModelProviders
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var imagePhoto: ImageView = findViewById(R.id.imagePhoto)

        //var model: MainActivityViewModel = MainActivityViewModel()

        //Uso ViewModel
        var model = ViewModelProviders.of(this).get(MainActivityViewModel::class.java)

        Picasso
            .get()
            .load(model.callUrlImage())
            .into(imagePhoto)

    }
}
