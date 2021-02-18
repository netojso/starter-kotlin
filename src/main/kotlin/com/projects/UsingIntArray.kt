package com.projects

fun main() {
    val values = IntArray(10)

    for (index in values.indices) {
        values[index] = index + 1
    }

    values.forEach { i ->
        println(i)
    }
}