package com.example.core.utilityfunctions

/**
 * @author Girdhar Singh Rathore
 * @date Friday, August 18, 2023, 3:10 PM
 */

fun main(args: Array<String>) {

    val a = "hi"
    val result = a?.let {
        getInt()
    }

    println(result)
}


fun getInt(): Int {
    return 1
}