package paulo.com.coderswag.Services

import paulo.com.coderswag.Model.Category
import paulo.com.coderswag.Model.Product

object DataService {
    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodiesimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Devslopes Graphic Beanies", "$18", "hat01"),
        Product("Devslopes Hat Black", "$20", "hat02"),
        Product("Devslopes Hat White", "$18", "hat03"),
        Product("Devslopes Hat Snapback", "$22", "hat04")
    )

    val hoodies = listOf(
        Product("Devlopes Hoodie Gray", "$28", "hoodie01"),
        Product("Devlopes Hoodie Red", "$30", "hoodie02"),
        Product("Devlopes Gray Hoodie", "$28", "hoodie03"),
        Product("Devlopes Back Hoodie", "$30", "hoodie04")
    )

    val shirts = listOf(
        Product("Devlopes Shirt Black", "$18", "shirt01"),
        Product("Devlopes Badge Shirt Gray", "$20", "shirt02"),
        Product("Devlopes Logo Shirt Red", "$22", "shirt03"),
        Product("Devlopes Hustle", "$22", "shirt04"),
        Product("Kickflip Studios", "$18", "shirt05")
    )
}