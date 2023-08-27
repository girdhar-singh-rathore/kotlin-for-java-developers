package com.example.core.inlinefunctions

/**
 * @author Girdhar Singh Rathore
 * @date Sunday, August 27, 2023, 5:54 PM
 */

fun main(args: Array<String>) {

    //library functions looking like built in language constructs
    // under the hood lambda might be inlined

    //run function
    //run function is used to execute a block of code on an object
    //it returns the last statement

    val a = "hi"
    val result = run {
        println("a")
        "some result"
    }
    println(result)


    //let function
    //allow to check the argument for being non null, not only the receiver
    class Email
    fun getEmail(): Email?{
        return null
    }
    val email = getEmail()
    if (email != null) {
        println(email)
    }
    //above can be written as, it introduces a new variable for the receiver
    email?.let { e -> println(e) } // or use it
    getEmail()?.let {
        println(it)
    }


    //takeIf
    //takeIf returns the receiver object if it satisfies the given predicate or null otherwise
    val number = 10
    val evenOrNull = number.takeIf { it % 2 == 0 }
    println(evenOrNull)

    //using takeIf in chaining
    val string = "Hello"
    val result2 = string.takeIf { it.isNotEmpty() }?.let {
        it + "kotlin"
    } ?: "empty"
    println(result2)

    //takeUnless
    //takeUnless returns the receiver object if it does not satisfy the given predicate or null otherwise
    val oddOrNull = number.takeUnless { it % 2 == 0 }
    println(oddOrNull)

    //repeat
    //repeat function is used to repeat a given action specified number of times
    repeat(10) {
        println("hello")
    }

    //all above functions are inlined



}
