package com.example.clipping_example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

//        replace the default content view and set the content view to a new instance of ClippedView.
    //        This will be your custom view for the clipping examples that you will create next.
        setContentView(ClippedView(this))
    }
}

