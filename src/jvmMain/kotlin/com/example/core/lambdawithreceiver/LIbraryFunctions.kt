package com.example.core.lambdawithreceiver

/**
 * @author Girdhar Singh Rathore
 * @date Tuesday, August 29, 2023, 6:19 PM
 */

fun main(args: Array<String>) {

    //run function
    val name = "Arya"

    val nameResult = name.run {
        println("length of $this is $length}")
    }

    println("nameResult is $nameResult")

    //apply function
    //return receiver as result

    val sb = StringBuilder()
    val result = sb.apply {
        append("Alphabet: ")
        for (c in 'a'..'z') {
            append(c)
        }
    }.append(" end")
    println(result.toString())


    //also function
    val sb1 = StringBuilder()
    sb1.apply {
        append("Alphabet: ")
        for (c in 'a'..'z') {
            append(c)
        }
    }.also {
        displayString(it)
    }


}

fun displayString(builder: StringBuilder) {
    println("result from display String is ${builder.toString()}")
}