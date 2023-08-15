package com.example.core.playground

/**
 * @author Girdhar Singh Rathore
 * @date Tuesday, August 15, 2023, 9:06 PM
 */

//Change the 'sum' function so that it was declared as an extension to List<Int>.

/*fun sum(list: List<Int>): Int {
    var result = 0
    for (i in list) {
        result += i
    }
    return result
}*/


fun List<Int>.sum(): Int {
    var result = 0
    for (i in this) {
        result += i
    }
    return result
}
fun main(args: Array<String>) {
    //val sum = sum()
    println(listOf(1, 2, 3).sum())    // 6
}