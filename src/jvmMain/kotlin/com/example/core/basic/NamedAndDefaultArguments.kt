package com.example.core.basic

/**
 * @author Girdhar Singh Rathore
 * @date Monday, August 14, 2023, 6:39 PM
 */
fun main(args: Array<String>) {

    println(listOf(1, 2, 3).joinToString(prefix = "[", postfix = "]"))
    println(listOf(1, 2, 3).joinToString(postfix = "."))
    println(listOf(1, 2, 3).joinToString{

        println("$it")
        "$it"
    })


}