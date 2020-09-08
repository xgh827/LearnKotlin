package com.xgh.learnKotlin.lesson1

fun main() {
    val a = 29
    val b = 39
    val value = largerNumber(a, b)
    println("lager number is $value")
    println(getScore("Jack"))
    checkNumber(50L)
}

// 语法糖：当函数的内容只有一行代码时使用的简略写法
// 由于kotlin的if和when都支持返回数值，配合语法糖能将函数编写高度简化
fun largerNumber(num1: Int, num2: Int) = if (num1 > num2) num1 else num2

// 无参数when写法
fun getScore(name: String) = when {
    name.startsWith("Tom") -> 86
    name == "Jim" -> 77
    name == "Jack" -> 95
    name == "Lily" -> 100
    else -> 0
}

// 因为kotlin采用对象数据类型，Int、Double等数字型数据都是Number的子类，所以能直接进行类型匹配
fun checkNumber(num: Number) = when (num) {
    is Int -> println("$num is Int")
    is Double -> println("$num is Double")
    else -> println("$num is not support")
}
