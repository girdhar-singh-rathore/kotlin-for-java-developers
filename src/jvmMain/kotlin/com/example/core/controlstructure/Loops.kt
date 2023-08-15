package com.example.core.controlstructure

/**
 * @author Girdhar Singh Rathore
 * @date Tuesday, August 15, 2023
 */

fun main(args: Array<String>) {

}

//while

fun whileLoop() {
    var x = 10
    while (x > 0) {
        println(x--)
    }
}

fun doWhileLoop() {
    var x = 10
    do {
        println(x--)
    } while (x > 0)
}

// for
// type can be removed
fun forLoop() {
    val list = listOf(1, 2, 3)
    for (element: Int in list) {
        println(element)
    }

    // iterating with index
    for((index, element) in list.withIndex()) {
        println("$index: $element")
    }

    // iterating over ranges
    for (i in 1..9) {
        println(i)
    }

    // include lower bound
    for(i in 1 until  9){
        println(i)
    }

    // step

    for (i in 1..0 step 2){
        println(i)
    }

    // downTo
    for (i in 9 downTo 1 step 2){
        println(i)
    }

    // iterating over string
    for (c in "abc"){
        println(c) //
        //a
        //b
        //c
    }


}