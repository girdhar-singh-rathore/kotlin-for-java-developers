package com.example.core.basic

/**
 * @author Girdhar Singh Rathore
 * @date Monday, August 14, 2023, 5:44 PM
 */


/**
 * Kotlin has powerful type inference. While you can explicitly declare the type of a variable,
 * you'll usually let the compiler do the work by inferring it. Kotlin does not enforce immutability,
 * though it is recommended. In essence use val over var.*/
fun main(args: Array<String>) {

    var a: String = "initial"
    println(a)
    val b: Int = 1
    val c = 3


    val d: Int
    if (someCondition()) {
        d = 1
    } else {
        d = 2
    }

    println(d)
}

fun someCondition(): Boolean {
    return true
}
