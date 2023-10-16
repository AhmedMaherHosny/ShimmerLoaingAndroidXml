package com.example.shimmerloaingxml.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.shimmerloaingxml.adapters.ProductsAdapter
import com.example.shimmerloaingxml.databinding.ActivityMainBinding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel
    private val productsAdapter = ProductsAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        initRecyclerView()
    }

    override fun onResume() {
        binding.shimmerLayout.startShimmer()
        super.onResume()
    }

    override fun onPause() {
        binding.shimmerLayout.stopShimmer()
        super.onPause()
    }


    private fun initRecyclerView() {
        binding.productsRecyclerView.adapter = productsAdapter
        binding.productsRecyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        viewModel.viewModelScope.launch {
            binding.shimmerLayout.startShimmer()
            delay(5000L)
            binding.shimmerLayout.stopShimmer()
            binding.shimmerLayout.isVisible = false
            binding.productsRecyclerView.isVisible = true
            productsAdapter.products = viewModel.getListOfProducts()
        }
    }
}