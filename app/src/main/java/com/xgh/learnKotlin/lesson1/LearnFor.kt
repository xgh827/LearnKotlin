package com.xgh.learnKotlin.lesson1

// for-i在kotlin中被舍弃，for-each被改写扩充为for-in
fun main() {
    for (i in 0..10)
        print("$i ")
    println()
    for (i in 0 until 10)
        print("$i ")
    println()
    for (i in 0..10 step 2)
        print("$i ")
    println()
    for (i in 0 downTo -8)
        print("$i ")
}

// while的用法与java没有太大区别