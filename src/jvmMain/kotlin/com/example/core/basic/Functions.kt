package com.example.core.basic

/**
 * @author Girdhar Singh Rathore
 * @date Monday, August 14, 2023, 6:28 PM
 */

fun main(args: Array<String>) {

}


fun max(a : Int, b : Int) : Int {
    return if (a > b) a else b
}

// can be written as
fun max2(a : Int, b : Int) : Int = if (a > b) a else b

// can be written as
fun max3(a : Int, b : Int) = if (a > b) a else b

// funtion returning unit
fun printMax(a : Int, b : Int) : Unit {
    println(max(a, b))
}