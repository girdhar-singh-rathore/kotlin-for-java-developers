package com.example.core.properties

/**
 * @author Girdhar Singh Rathore
 * @date Thursday, August 24, 2023, 9:48 PM
 */

class Consumer{
    val name: String = "some name"
    var age: Int = 25
}

fun main(args: Array<String>) {
    val consumer = Consumer()
    println(consumer.name)
    println(consumer.age)
}