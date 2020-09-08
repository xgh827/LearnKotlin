package com.xgh.learnKotlin.lesson1

// 在构造函数中，可直接给参数赋默认值
class Student(name: String = "Name", age: Int = 18) : Person(name, age),
    Study {
    override fun readBooks() {
        println("$name is reading.")
    }

    override fun doHomeWork() {
        println("$name is doing homework.")
    }
}

fun main() {
    val student =
        Student(name = "Jack")    // kotlin支持通过键值对给构造函数赋值
    println("${student.name} is ${student.age} years old.") // 因此次构造函数在kotlin中不是必要的
    doStudy(student)
}

fun doStudy(study: Study) {
    study.readBooks()
    study.doHomeWork()
}

//由于没有主构造函数，Person后面不需要添加括号
class Student1 : Person {
    constructor(name: String, age: Int) : super(name, age) {
        //
    }
}
