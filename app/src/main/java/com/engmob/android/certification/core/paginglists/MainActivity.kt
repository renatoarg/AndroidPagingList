package com.engmob.android.certification.core.paginglists

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.engmob.android.certification.core.paginglists.ui.MainViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.fetchList()
    }
}