package com.example.core.playground

/**
 * @author Girdhar Singh Rathore
 * @date Monday, August 28, 2023, 7:20 PM
 */

fun fibonacci(): Sequence<Int> = sequence {
    var terms = Pair(0, 1)
    while (true) {
        yield(terms.first)
        terms = Pair(terms.second, terms.first + terms.second)
    }
}

fun main(args: Array<String>) {
    val result = fibonacci().take(4).toList().toString() ==
            "[0, 1, 1, 2]"
    println(result)

    val result2 = fibonacci().take(10).toList().toString() ==
            "[0, 1, 1, 2, 3, 5, 8, 13, 21, 34]"
    println(result2)
}