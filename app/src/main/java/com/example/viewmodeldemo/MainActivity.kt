package com.example.viewmodeldemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.viewmodeldemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        viewModel = MainActivityViewModel()
        binding.resultTextView.text = viewModel.getTotal().toString()

        binding.insertButton.setOnClickListener {
            viewModel.setTotal(binding.inputEditText.text.toString().toInt())
            binding.resultTextView.text = viewModel.getTotal().toString()
        }
    }
}