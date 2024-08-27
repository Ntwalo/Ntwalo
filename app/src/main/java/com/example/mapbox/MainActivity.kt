package com.example.mapbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mapbox.common.MapboxOptions

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        MapboxOptions.accessToken = "pk.eyJ1IjoibnR3YWxvMjgiLCJhIjoiY20wYzF3djdoMGVzdTJxcjB3bzJpbHMyaiJ9.hrNjYHltIB9P5aplKbZ04w"


        setContentView(R.layout.activity_main)

    }
}