package com.example.core.objectoriented

import io.ktor.util.*

/**
 * @author Girdhar Singh Rathore
 * @date Friday, August 25, 2023, 8:03 PM
 */

//sealed modifier
//it restricts the class hierarchy
//all sub class must be location in same file

sealed class Expr

class Num(val value: Int) : Expr()
class Sum(val first: Expr, val second: Expr): Expr()

fun eval(expr: Expr): Int =  when(expr){
    is Num -> expr.value
    is Sum -> eval(expr.first) + eval(expr.second)
}

fun main(args: Array<String>) {
    println(eval(Sum(Num(1),Num(2))))
}