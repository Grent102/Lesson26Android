package com.example.lesson26recycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lesson26recycler.databinding.ActivityEditBinding

class EditActivity : AppCompatActivity() {
    lateinit var bind : ActivityEditBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityEditBinding.inflate(layoutInflater)
        setContentView(bind.root)
    }
}