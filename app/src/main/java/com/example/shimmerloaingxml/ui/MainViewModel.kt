package com.example.shimmerloaingxml.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.shimmerloaingxml.models.Product
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.util.concurrent.TimeUnit

class MainViewModel : ViewModel() {
    private val listOfProducts = listOf(
        Product(
            id = 1,
            title = "Cigar",
            desc = "Indulge in the rich and robust flavors of our premium cigars, a testament to craftsmanship and tradition.",
            imageName = "cigar"
        ),
        Product(
            id = 1,
            title = "Cigar",
            desc = "Indulge in the rich and robust flavors of our premium cigars, a testament to craftsmanship and tradition.",
            imageName = "cigar"
        ),
        Product(
            id = 1,
            title = "Cigar",
            desc = "Indulge in the rich and robust flavors of our premium cigars, a testament to craftsmanship and tradition.",
            imageName = "cigar"
        ),
        Product(
            id = 1,
            title = "Cigar",
            desc = "Indulge in the rich and robust flavors of our premium cigars, a testament to craftsmanship and tradition.",
            imageName = "cigar"
        ),
        Product(
            id = 1,
            title = "Cigar",
            desc = "Indulge in the rich and robust flavors of our premium cigars, a testament to craftsmanship and tradition.",
            imageName = "cigar"
        ),
        Product(
            id = 1,
            title = "Cigar",
            desc = "Indulge in the rich and robust flavors of our premium cigars, a testament to craftsmanship and tradition.",
            imageName = "cigar"
        ),
        Product(
            id = 1,
            title = "Cigar",
            desc = "Indulge in the rich and robust flavors of our premium cigars, a testament to craftsmanship and tradition.",
            imageName = "cigar"
        ),
        Product(
            id = 1,
            title = "Cigar",
            desc = "Indulge in the rich and robust flavors of our premium cigars, a testament to craftsmanship and tradition.",
            imageName = "cigar"
        ),
        Product(
            id = 1,
            title = "Cigar",
            desc = "Indulge in the rich and robust flavors of our premium cigars, a testament to craftsmanship and tradition.",
            imageName = "cigar"
        ),
        Product(
            id = 1,
            title = "Cigar",
            desc = "Indulge in the rich and robust flavors of our premium cigars, a testament to craftsmanship and tradition.",
            imageName = "cigar"
        ),
        Product(
            id = 1,
            title = "Cigar",
            desc = "Indulge in the rich and robust flavors of our premium cigars, a testament to craftsmanship and tradition.",
            imageName = "cigar"
        ),
        Product(
            id = 1,
            title = "Cigar",
            desc = "Indulge in the rich and robust flavors of our premium cigars, a testament to craftsmanship and tradition.",
            imageName = "cigar"
        ),
        Product(
            id = 1,
            title = "Cigar",
            desc = "Indulge in the rich and robust flavors of our premium cigars, a testament to craftsmanship and tradition.",
            imageName = "cigar"
        ),
        Product(
            id = 1,
            title = "Cigar",
            desc = "Indulge in the rich and robust flavors of our premium cigars, a testament to craftsmanship and tradition.",
            imageName = "cigar"
        ),
        Product(
            id = 1,
            title = "Cigar",
            desc = "Indulge in the rich and robust flavors of our premium cigars, a testament to craftsmanship and tradition.",
            imageName = "cigar"
        ),
    )

    fun getListOfProducts(): List<Product> {
        return listOfProducts
    }
}