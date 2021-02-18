package com.projects

import java.util.*

fun main() {
    val names = Array(5) {""}

    for (index in names.indices) {
        names[index] = UUID.randomUUID().toString()
    }

    names.forEach { n ->
       println(n)
    }

}