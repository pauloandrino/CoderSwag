package paulo.com.coderswag.Services

import paulo.com.coderswag.Model.Category
import paulo.com.coderswag.Model.Product

object DataService {
    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Devslopes Graphic Beanies", "$18", "hat1"),
        Product("Devslopes Hat Black", "$20", "hat2"),
        Product("Devslopes Hat White", "$18", "hat3"),
        Product("Devslopes Hat Snapback", "$22", "hat4")
    )

    val hoodies = listOf(
        Product("Devlopes Hoodie Gray", "$28", "hoodie1"),
        Product("Devlopes Hoodie Red", "$30", "hoodie2"),
        Product("Devlopes Gray Hoodie", "$28", "hoodie3"),
        Product("Devlopes Back Hoodie", "$30", "hoodie4")
    )

    val shirts = listOf(
        Product("Devlopes Shirt Black", "$18", "shirt1"),
        Product("Devlopes Badge Shirt Gray", "$20", "shir2"),
        Product("Devlopes Logo Shirt Red", "$22", "shirt3"),
        Product("Devlopes Hustle", "$22", "shirt4"),
        Product("Kickflip Studios", "$18", "shirt5")
    )

    val digitalGood = listOf<Product>()

    fun getProducts(category: String) : List<Product> {

        return when(category) {
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digitalGood
        }
    }
}