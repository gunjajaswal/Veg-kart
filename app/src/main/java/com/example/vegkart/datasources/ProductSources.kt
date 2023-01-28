package com.example.vegkart.datasources

import com.example.vegkart.R
import com.example.vegkart.models.Product

class ProductSources {

    fun get():List<Product>{
        return listOf(
            Product("Capsicum",75, R.drawable.product1),
            Product("Strawbery",350,R.drawable.product2),
            Product("Peas",95, R.drawable.product3),
            Product("Cabbage",70,R.drawable.product4),
            Product("Tomato",50, R.drawable.product5),
            Product("Broccoli",120,R.drawable.product6),
            Product("Carrots",50, R.drawable.product7),
            Product("Vegitable Juice",130,R.drawable.product8),
            Product("Onion",40, R.drawable.product9),
            Product("Apple",80,R.drawable.product10),
            Product("Garlic",40, R.drawable.product11),
            Product("Red Chilli",60,R.drawable.product12),


        )
    }
}