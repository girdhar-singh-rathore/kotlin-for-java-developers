package com.example.core.objectoriented

/**
 * @author Girdhar Singh Rathore
 * @date Saturday, August 26, 2023, 7:42 PM
 */

// companion object
// it is a nested object inside a class but it is a special object
// the one which members cab be accessed using only class name
// companion object is a way to define static methods and properties in kotlin
// it is similar to java static methods and properties
// it is used if you need a class with some static methods and properties

class A{
    companion object {
        fun create(): A = A()
        val someProperty = 1
        fun display() {
            println("display")
        }

    }
}

//why companion object is batter than java static methods and properties
//1. companion object can implement interface
//2. companion object can be passed as an argument
//3. companion object can be used as an extension function
//4. companion object can access private constructor of class

interface Factory<T> {
    fun create(): T
}
class B{
    private constructor()
    companion object: Factory<B> {
        override fun create(): B = B()
    }
}

//companion object can be used as an extension function

fun B.Companion.display() {
    println("display")
}

fun main(args: Array<String>) {
    val a = A.create()
    println(A.someProperty)
    A.display()

    val b = B.create()

    B.display()

}