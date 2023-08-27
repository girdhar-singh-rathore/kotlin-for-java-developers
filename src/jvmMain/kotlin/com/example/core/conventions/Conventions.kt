package com.example.core.conventions

/**
 * @author Girdhar Singh Rathore
 * @date Sunday, August 27, 2023, 9:28 AM
 */
// comparisons
// you can compare string using == and != , < , > , <= , >=
// not only string but any classes that design comparator for

// a = "abc" , b = "abc"
// a < b, under the hood a.compareTo(b) < 0

//equality checks
// == and != are translated to equals() calls
// a == b, under the hood a?.equals(b) ?: (b === null)
fun main() {
    //equality checks, corrctly handles null
    val a = "abc"
    val b = "abc"
    println(a == b)

    // access elements by index
    val str = "abc"
    println(str[0])
    // under the hood str.get(0)

    //in convention
    val list = listOf("a","b","c")
    println("a" in list)
    // under the hood list.contains("a")

    //range to convention
    val range = 0..10
    // under the hood call ragen

    // the iterator convention, string is iterable unlike java
    for (c in str) {
        println(c)
    }

    //destructuring declaration, it works for loops, lambda
    val (number, name) = 1 to "one"
    //under the hood, component1() and component2() are called
    val pair = 1 to "one"
    val number2 = pair.component1()
    val name2 = pair.component2()


    //iterating over list with index, uses the destructuring declaration

    //destructuring declaration and data classes
    //component functions are generated for data classes


}