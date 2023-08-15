package com.example.core.playground

/**
 * @author Girdhar Singh Rathore
 * @date Tuesday, August 15, 2023
 */

/**
Implement the function that checks whether a string is a valid identifier.
A valid identifier is a non-empty string that starts with a letter or underscore
and consists of only letters, digits and underscores.
 */
fun isValidIdentifier(s: String): Boolean {

    fun isValidCharacter(ch: Char) = ch == '_' || ch in '0'..'9' || ch in 'a'..'z' || ch in 'A'..'Z'

    for (ch in s) {
        if (!isValidCharacter(ch)) return false
    }
    return true
}

fun main(args: Array<String>) {
    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier("_12"))    // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false
    println(isValidIdentifier("no$"))    // false
}