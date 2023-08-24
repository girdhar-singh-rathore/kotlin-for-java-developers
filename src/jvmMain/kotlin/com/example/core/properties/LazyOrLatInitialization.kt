package com.example.core.properties

/**
 * @author Girdhar Singh Rathore
 * @date Thursday, August 24, 2023, 10:51 PM
 */

// lazy initialization
// lazy is a function that takes a lambda and returns an instance of Lazy<T>

val lazyValue: String by lazy {
    println("computed")
    "Hello"
}

//late initialization
//lateinit is a modifier that can only be used on var properties of classes

lateinit var name: String

//lateinit can only be used on var properties of classes
//'lateinit' modifier is allowed only on mutable properties
// it can not be nullable
// below line will not compile
//lateinit val name2: String

fun main(args: Array<String>) {
    println(lazyValue)
    println(lazyValue)
    println(lazyValue)

    //below line will throw an exception runtime exception
    //println(name)
    name = "John"
    println(name)


    //checking if lateinit variable is initialized or not
    if (::name.isInitialized) {
        println("name is initialized")
    }
}