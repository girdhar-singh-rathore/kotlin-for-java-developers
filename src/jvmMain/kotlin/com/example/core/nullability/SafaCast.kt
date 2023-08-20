package com.example.core.nullability

import java.util.*

/**
 * @author Girdhar Singh Rathore
 * @date Saturday, August 19, 2023, 10:02 PM
 */

fun main(args: Array<String>) {

    val name : String? = "Kotlin"

    //is is similar to instanceof in java
    if (name is String) {
        val s = name as String // as is typecast
        // here as is not required, because is smart cast the variable to String
        println(name.uppercase(Locale.getDefault()))
    }
    //typecast as throws ClassCastException if the typecast is not possible

    // safe cast as? return null if the typecast is not possible

    val s1 : String? = "Kotlin"

    (s1 as? String)?.uppercase(Locale.getDefault())


/**
    Safe casts
    Type cast as throws ClassCastException, if the cast is unsuccessful. Safe cast as? returns null, if the cast is unsuccessful.
    Declare the s variable to make the first line print null and the second one throw an exception.
*/

    val s = "abc"
    println(s as? Int)    // null
    println(s as Int?)    // exception




}