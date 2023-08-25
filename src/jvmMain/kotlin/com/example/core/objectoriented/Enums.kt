package com.example.core.objectoriented

/**
 * @author Girdhar Singh Rathore
 * @date Friday, August 25, 2023, 7:36 PM
 */
// if you need a class with fixed number of values, you can use enum
enum class Color {
    BLUE, ORANGE, RED
}

// enum class with properties
enum class Color1(val r: Int, val g: Int, val b: Int) {
    BLUE(0, 0, 255),
    ORANGE(255, 165, 0),
    RED(255, 0, 0);

    fun rgb() = (r * 256 + g) * 256 + b
}

// data class
// data modifier generate the equals, hashcode, toString, copy and some other useful methods

data class Foo(val first: String, val second: String)

//compiler only uses the properties defined in primary constructor
//here equals, toString methods generated for only name
data class User(val name: String){
    val city: String? = null
}
fun main(args: Array<String>) {
    //most common way to work with enums is to use with when
    val color: Color = Color.BLUE
    when (color) {
        Color.BLUE -> println("color is blue")
        Color.RED -> println("color is red")
        Color.ORANGE -> println("color is green")
    }

    println(Color1.RED.rgb())
}
