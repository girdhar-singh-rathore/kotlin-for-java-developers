package com.example.core.conventions

/**
 * @author Girdhar Singh Rathore
 * @date Sunday, August 27, 2023, 8:39 AM
 */
// operator overloading
// operator overloading is a way to define how an operator works on a class
// operator overloading is done using operator keyword

//operator fun Int.times(str: String) = str.repeat(this)

operator fun String.get(range: IntRange) = substring(range)
