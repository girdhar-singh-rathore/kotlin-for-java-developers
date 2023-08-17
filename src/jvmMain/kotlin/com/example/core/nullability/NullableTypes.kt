package com.example.core.nullability

/**
 * @author Girdhar Singh Rathore
 * @date Thursday, August 17, 2023, 8:36 PM
 */
// modern approach is to make null pointer exception compile time error rather than runtime error

// kotlin distinguishes between nullable and non-nullable types
// nullable types are denoted by postfixing a ? to the type
// non-nullable types are denoted by postfixing a ! to the type

fun main(args: Array<String>) {

    val s1 : String = "always not null"
    s1.length // no need to check for null
    val s3 : String? = "can be null"
    //val s4: String = null // compile time error
    val s2 : String? = null
    //s2.length // compile time error
    if (s2 != null) {
        s2.length // no need to check for null
    }

    //safe call operator
    //returns null if the object is null
    //otherwise returns the property
    val length: Int? = s2?.length
    println(length)

    //elvis operator
    //if the expression to the left of the elvis operator is not null
    //then the elvis operator returns it
    //otherwise it returns the expression to the right
    val l = s2?.length ?: -1
    println(l)

    //making exceptions null
    //can be used when kotlin compiler is not smart enough to figure out that the object is not null
    val l2 = s2!!.length // throws null pointer exception
    println(l2)


    // using not null assertion operator


    //Nullable types under the hood
    //Nullable types are implemented using annotations @Nullable and @NotNull
    // kotlin compiler adds these annotations
    // Which gives us no performance overheads when using Nullable types





}