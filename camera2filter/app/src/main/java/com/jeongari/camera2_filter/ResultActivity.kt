package com.jeongari.camera2_filter

import android.content.Intent
import android.graphics.BitmapFactory
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import jp.co.cyberagent.android.gpuimage.filter.GPUImagePosterizeFilter
import jp.co.cyberagent.android.gpuimage.filter.GPUImageSobelEdgeDetectionFilter
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val extras : Bundle ?= intent.extras
        val byteArray = extras?.getByteArray("pic")

        val bitmap = BitmapFactory.decodeByteArray(byteArray,0, byteArray!!.size)
        resultGpuIv.setImage(bitmap)
        resultGpuIv.filter = GPUImagePosterizeFilter()


    }
}