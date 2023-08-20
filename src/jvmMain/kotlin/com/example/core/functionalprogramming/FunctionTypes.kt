package com.example.core.functionalprogramming

/**
 * @author Girdhar Singh Rathore
 * @date Sunday, August 20, 2023, 4:04 PM
 */

fun main(args: Array<String>) {

    // function type
    // in kotlin you can store lambda in a variable

    val sum = { x: Int, y: Int -> x + y }
    // sum is function type
    // variable sum is of type (Int, Int) -> Int
    // parameter types are written in parentheses, than arrow, than return type
    // in this case a type take tow int parameters and return an int

    // calling stored function
    println("calling stored function: ${sum(1, 2)}")

    val isEven: (Int) -> Boolean = { number: Int -> number % 2 == 0 }
    println("calling stored function isEven: ${isEven(2)}")
    //lambda is a whole function containing the logic of how to compute the boolean result from the given int parameter


    //passing a variable of function type as an argument
    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    println("passing a variable of function type as an argument: ${list.any(isEven)}")
    println("passing a variable of function type as an argument: ${list.filter { it % 2 == 0 }}")

    // calling lambda directly
    run { println("calling lambda directly") }
    val runResult = run { 6 }
    println("run result: $runResult")

    //SAM interfaces in java
    // single abstract method interfaces
    // in java you can pass a lambda where a SAM interface is expected
    // in kotlin you can do the same thing
    // kotlin has a special syntax for that

    //Function type and nullability
    //function type that turns nullable values and nullable function type  () -> Int? ,, ((Int) -> Int)?

    //() -> Int? // function type that takes no parameters and returns an int or null

    //((Int) -> Int)? // whole type is nullable, or the function itself is nullable
}