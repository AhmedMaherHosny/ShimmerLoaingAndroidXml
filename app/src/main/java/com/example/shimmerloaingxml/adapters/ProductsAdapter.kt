package com.example.shimmerloaingxml.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.shimmerloaingxml.databinding.ProductItemBinding
import com.example.shimmerloaingxml.models.Product

class ProductsAdapter : RecyclerView.Adapter<ProductsAdapter.ProductsViewHolder>() {

    private val diffCallback = object : DiffUtil.ItemCallback<Product>() {
        override fun areItemsTheSame(oldItem: Product, newItem: Product): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: Product, newItem: Product): Boolean {
            return oldItem == newItem
        }
    }
    private val differ = AsyncListDiffer(this, diffCallback)

    var products: List<Product>
        get() = differ.currentList
        set(value) = differ.submitList(value)

    class ProductsViewHolder(private val binding: ProductItemBinding) : ViewHolder(binding.root) {
        fun bind(product: Product) {
            binding.productImage.setImageResource(getImageResourceId(product.imageName))
            binding.productTitle.text = product.title
            binding.productDesc.text = product.desc
        }

        private fun getImageResourceId(imageName: String): Int {
            val context = binding.root.context
            return context.resources.getIdentifier(imageName, "drawable", context.packageName)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductsViewHolder {
        val binding = ProductItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ProductsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ProductsViewHolder, position: Int) {
        val product = products[position]
        holder.bind(product)
    }

    override fun getItemCount(): Int = products.size

}