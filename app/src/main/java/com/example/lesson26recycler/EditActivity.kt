package com.example.lesson26recycler

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lesson26recycler.databinding.ActivityEditBinding

class EditActivity : AppCompatActivity() {
    private lateinit var bind: ActivityEditBinding
    private var indexIm = 0
    private var imageId = R.drawable.palnt1
    private val imageIdList = listOf(
        R.drawable.palnt1,
        R.drawable.palnt2,
        R.drawable.palnt3,
        R.drawable.palnt4,
        R.drawable.palnt5
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityEditBinding.inflate(layoutInflater)
        setContentView(bind.root)
        initButtons()
    }

    private fun initButtons() = with(bind) {
        btNextIm.setOnClickListener {
            indexIm++
            if (indexIm > imageIdList.size - 1) indexIm = 0
            imageId = imageIdList[indexIm]
            ivEdit.setImageResource(imageId)
        }

        btDone.setOnClickListener {
            val plant = Plant(imageId, edTitle.text.toString(), edDesc.text.toString())
            val editIntent = Intent().apply {
                putExtra("plant", plant)
            }
            setResult(RESULT_OK, editIntent)
            finish()

        }
    }
}