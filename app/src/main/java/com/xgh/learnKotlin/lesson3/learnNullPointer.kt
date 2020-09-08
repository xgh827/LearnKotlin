package com.xgh.learnKotlin.lesson3

import com.xgh.learnKotlin.lesson1.Study

fun main() {
    doStudy(study = null)
}

fun doStudy(study: Study?) {
    study?.let {
        it.readBooks()
        it.doHomeWork()
    }
}

fun getTextLength(text: String?) = text?.length ?: 0