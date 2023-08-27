package com.example.core.objectoriented

/**
 * @author Girdhar Singh Rathore
 * @date Sunday, August 27, 2023, 7:58 AM
 */

// generics
// generics are used to define classes and functions which can work on different types
// generics are defined using angle brackets <>

//interface List<T> {
//     fun get(index: Int): T
//}

fun foo(list: List<String>) {
    val string = list.get(0)
    println(string)
    //call the generic function filter
    val list2 = list.filter { it.length > 0 }
}

fun bar(list: List<Int>) {
    val int = list.get(0)
    println(int)
    //call the generic function filter
    val list2 = list.filter { it > 0 }
}


//fun with all generics types

fun <T> List<T>.filter(predicate : (T) -> Boolean): List<T>{
    val result = ArrayList<T>()
    for (item in this) {
        if (predicate(item)) {
            result.add(item)
        }
    }
    return result
}


//nullable generics parameters
fun <T> List<T>.filterOrNull(): List<T>? {
    return null
}
// substituion type become nullable
//val list  = listOf(1,2,3)
// val list2: Int? = list.filterOrNull(
//


// define non null upper bound, with any keyword
//fun <T: Any> List<T>.filterOrNull(): List<T>? {

//following will not compile
// foo(listOf(1,null))


//nullable uper bound can be defined with Any? keyword
//fun <T: Any?> List<T>.filterOrNull(): List<T>? {

//comparable upper bound
//fun <T: Comparable<T>> List<T>.filterOrNull(): List<T>? {

//multiple upper bound
//fun <T> List<T>.filterOrNull(): List<T>? where T: CharSequence, T: Comparable<T> {

fun main(args: Array<String>) {
//    val list = object : List<String> {
//        override fun get(index: Int): String {
//            return "hello"
//        }
//    }
//    foo(list)


}