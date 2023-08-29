package com.example.core.types

/**
 * @author Girdhar Singh Rathore
 * @date Tuesday, August 29, 2023, 7:30 PM
 */


fun main(args: Array<String>) {

    //Unit is a type with only one value - Unit. This value does not hold any information.

    //Nothing is a type with no values. You can use Nothing to represent "a value that never exists": for example,
    // if a function has the return type of Nothing, it means that it never returns (always throws an exception).


    //nothing type
    val timeHasPassed = false
    val answer: Int = if (timeHasPassed) {
        42
    } else {
        fail("Error occurred")
    }


    //Any is top type
    //Nothing is bottom type
}

//function completed normally
fun ask() {
    println("I am asking")
}

//function completed abnormally

fun fail(message: String): Nothing {
    throw IllegalStateException(message)
}

//function never returns
fun infiniteLoop(): Nothing {
    while (true) {
    }
}