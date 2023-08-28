package com.example.core.inlinefunctions

import kotlin.random.Random

/**
 * @author Girdhar Singh Rathore
 * @date Monday, August 28, 2023, 9:32 PM
 */


fun main(args: Array<String>) {

    var counter = 0
    val numbers = generateSequence {
        println("Generating random number ${++counter}")
        Random.nextInt()
    }

    println(numbers.take(10).toList())

    //yield function
    val nums = sequence {
        println("in sequence")
        var x = 10
        while (true) {
            println("in while $x")
            yield(x)
            x++
        }
    }

    println(nums.take(10).toList())
}