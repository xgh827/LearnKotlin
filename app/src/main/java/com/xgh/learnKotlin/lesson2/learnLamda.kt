package com.xgh.learnKotlin.lesson2

fun main() {
    // listOf创建的是不可变的List集合
    // 使用mutableListOf创建可变的List集合
    val list = mutableListOf("Apple", "Banana", "Orange", "Pear", "Grape", "Watermelon")
//    val maxLengthFruit = list.maxBy { it.length }
//    println("max length fruit is $maxLengthFruit")
    val newList = list.map { it.toUpperCase() }
    val newList2 = list.filter { it.length <= 5 }
        .map { it.toUpperCase() }
    val anyResult = list.any { it.length <= 5 }
    val allResult = list.all { it.length <= 5 }
    println("anyResult is $anyResult, allResult is $allResult")
    Thread {
        println("Thread is running.")
    }.start()

//    initOther()
}

fun initOther() {
    // setOf和mutableSetOf分别创建不可变和可变的Set集合
    val set = mutableSetOf("Apple", "Banana", "Orange", "Pear", "Grape")
    set.add("Watermelon")
    for (fruit in set)
        println(fruit)

    // mapOf和mutableMapOf分别创建不可变和可变的Map集合
    val map = mutableMapOf("Apple" to 1, "Banana" to 2, "Orange" to 3, "Pear" to 4, "Grape" to 5)
    map["Watermelon"] = 6;
    for ((fruit, number) in map)
        println("fruit $fruit number is $number")
}