package com.xgh.learnKotlin.lesson1

data class Cellphone(val brand: String, val price: Double)

fun main() {
    val phone1 = Cellphone("OnePlus", 3299.0)
    val phone2 = Cellphone("Samsung", 6399.0)
    println(phone1)
    println("cellphone1 equals cellphone2? " + (phone1 == phone2))
    Singleton.singletonTest()
}