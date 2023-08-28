package com.example.core.lambdawithreceiver

/**
 * @author Girdhar Singh Rathore
 * @date Monday, August 28, 2023, 11:07 PM
 */

//extension function + lambda
//lambda with receiver

fun main(args: Array<String>) {
    val sb = StringBuilder()
    sb.append("Alphabet: ")
    for (c in 'a'..'z') {
        sb.append(c)
    }
    println(sb.toString())


    // the with function
    val sb2 = StringBuilder()
    sb2.append("Alphabet: ")
    with(sb2) {
        for (c in 'a'..'z') {
            append(c)
        }
    }
    println(sb2.toString())

    //putting lambda explicitly
    val sb3 = StringBuilder()
    sb3.append("Alphabet: ")
    with(sb3, {
        for (c in 'a'..'z') {
            this.append(c)
        }
        println(this.toString())
    })


    //extension function
    fun String.lastChar(): Char = this.get(this.length - 1)
    //can be written as, without this
    fun String.lastChar2(): Char = get(length - 1)


    //lambda with receiver
    buildString {
        this.append("Alphabet: ")
        println(this.toString())
    }

    //can be written as
    buildString {
        append("Alphabet: ")
        println(toString())
    }


    //lambda vs lambda with receiver
    //lambda
    val isEven: (Int) -> Boolean = {  it % 2 == 0 }

    //lambda with receiver
    val isEven2: Int.() -> Boolean = { this % 2 == 0 }

    //calling lambda
    println(isEven(5))
    //calling lambda with receiver as extension function
    println(5.isEven2())
}

