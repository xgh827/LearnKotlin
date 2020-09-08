package com.xgh.learnKotlin.lesson1

interface Study {
    fun readBooks()

    // 当接口中的函数有默认实现时，调用接口的类可以自由选择实现或不实现
    fun doHomeWork() {
        println("do homework default implementation.")
    }
}