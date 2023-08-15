package com.example.core.controlstructure

/**
 * @author Girdhar Singh Rathore
 * @date Tuesday, August 15, 2023, 2:30 PM
 */
// Exception handling
// kotlin does not differentiate between checked and unchecked exceptions
// function does not declare the exception it throws


fun main(args: Array<String>) {

    val number = 100
    val result = if (number in 1..10){
        number
    }else
        throw IllegalArgumentException("Number out of range")

   // println(result)
}