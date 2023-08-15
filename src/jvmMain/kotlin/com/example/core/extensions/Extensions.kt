package com.example.core.extensions

/**
 * @author Girdhar Singh Rathore
 * @date Tuesday, August 15, 2023, 6:56 PM
 */

// extension function

/**
Kotlin provides the ability to extend a class or an interface with new functionality without having to inherit from
the class or use design patterns such as Decorator. This is done via special declarations called extensions.
 */


// extension function
// if extension defined in same package, no need to import it else import it
// from java file, it can be called as static method
// you can not call private members of class from extensions
fun main(args: Array<String>) {

    fun String.lastChar(): Char = this.get(this.length-1)
    // can be called as, omitting this
    fun String.lastChar1(): Char = get(length-1)
    println("Kotlin".lastChar())

    // examples from the standard library
    // kotlin standard library is java standard library + kotlin extensions

    // standard collections
    val set = hashSetOf(1, 2, 3)
    val list = arrayListOf(1, 2, 3)
    val map = hashMapOf(1 to "one", 2 to "two", 3 to "three")

    println(set.javaClass)
    println(list.javaClass)
    println(map.javaClass)

    //there is no kotlin sdk, it is just java sdk + kotlin extensions
    //kotlin has small runtime jar, easy java interop

    //examples
    // joinToString
    println(listOf(1, 2, 3).joinToString(separator = "; ", prefix = "(", postfix = ")"))

    // string extensions
    // formatting multiline strings
    val kotlinLogo = """| //
                       .|//
                       .|/ \"""
    println(kotlinLogo.trimMargin("."))

    // to regex

}