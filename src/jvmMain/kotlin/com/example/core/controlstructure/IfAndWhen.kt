package com.example.core.controlstructure

/**
 * @author Girdhar Singh Rathore
 * @date Tuesday, August 15, 2023
 */

// if is an expression in kotlin
// no ternary operator in kotlin
// when as switch case
// when is an expression in kotlin
// no break statement in switch case
// when can have multiple values in a single case separated by comma
// when can have range in a single case
// when can have condition in a single case

fun main(args: Array<String>) {

    ifExpression()
    println(getDescription(Color.BLUE))
}

fun ifExpression() {
    val a = 10
    val b = 20
    val max = if (a > b) a else b
    println(max)
}

// when as switch case
enum class Color {
    RED, GREEN, BLUE,
}

fun getDescription(color: Color): String {
    return when (color) {
        Color.BLUE -> "cold"
        Color.GREEN -> "neutral"
        Color.RED -> "hot"
    }
}

// checking values

fun respondToInput(value: String): String {

    return when (value) {
        "y", "yes" -> "Agreed"
        "n", "no" -> "Disagreed"
        else -> "Not sure"
    }
}

// any expression can be used as branch condition

fun mix(c1: Color, c2: Color): Color {
    return when (setOf(c1, c2)) {
        setOf(Color.RED, Color.GREEN) -> Color.BLUE
        setOf(Color.BLUE, Color.GREEN) -> Color.RED
        else -> throw Exception("Dirty color")
    }
}


// checking type
// smart cast is used in when
fun checkTypes(x: Any) = when (x) {
    is Int -> println("Int")
    is String -> println("String")
    else -> println("Unknown")
}

// capturing when expression in a variable

fun captureWhenExpressionInVariable() {
    val result = when (val x = getType()) {
        is TypeA -> "$x is TypeA"
        is TypeB -> "$x is TypeB"
        else -> "Unknown"
    }
    println(result)
}

interface Type
data class TypeA(val a: String) : Type
class TypeB(val a: String) : Type

fun getType(): Type {
    return TypeA("A")
}

// when without argument
fun updateWeather(degree: Int) {
    val (desc, color) = when {
        degree < 10 -> "cold" to Color.BLUE
        degree < 25 -> "neutral" to Color.GREEN
        else -> "hot" to Color.RED
    }
}