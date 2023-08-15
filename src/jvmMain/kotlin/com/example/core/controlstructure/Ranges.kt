package com.example.core.controlstructure

/**
 * @author Girdhar Singh Rathore
 * @date Tuesday, August 15, 2023, 1:44 PM
 */

// in operator is used to check if a value is in a range or a collection
// in operator is used to iterate over a range

fun main(args: Array<String>) {

    // in check for belongingness
    println('c' in 'a'..'z')

    // in for iteration
    for (i in 1..9) {
        println(i)
    }

    // not in !in
    println('k' !in 'a'..'z')

    // in as in when expression
    when('c'){
        in 'a'..'z' -> println("lowercase")
        in 'A'..'Z' -> println("uppercase")
        else -> println("not an alphabet")
    }


    //different ranges
    // 1..9
    // 1 until 9
    // 9 downTo 1
    // 1..9 step 2
    // 9 downTo 1 step 2
    // 'a'..'z'
    //'ab'..'az'
    //startDate..endDate

    // comparing strings
    "ball"  in "a".."k"
    "a" <= "ball" && "ball" <= "k"
    "a".compareTo("ball") <= 0 && "ball".compareTo("k") <= 0
    //string are compared lexicographically/alphabetically order


}

//range of custom types
class MyDate : Comparable<MyDate> {
    override fun compareTo(other: MyDate): Int {
        TODO("Not yet implemented")
    }
}