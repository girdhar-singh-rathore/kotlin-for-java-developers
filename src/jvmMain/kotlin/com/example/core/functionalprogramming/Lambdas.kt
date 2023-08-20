package com.example.core.functionalprogramming

/**
 * @author Girdhar Singh Rathore
 * @date Saturday, August 19, 2023, 10:18 PM
 */

fun main(args: Array<String>) {

/**
    In Kotlin, Lambda always goes in curly braces. To distinguish regular curly braces, for instance, for if expression,
    from curly braces used in Lambdas, ID highlights in bold curly braces for Lambdas. When you see highlighted in
    bold curly braces, that means you see a Lambda. Inside curly braces, first you specify the parameters,
    then the arrow, then the Lambda body. If you pass a Lambda as an argument, you can put the whole Lambda inside
    the parentheses. However, there is a better way to express that. You can move Lambda out with parentheses,
    if the Lambda is the last argument, and if the parentheses are empty, you can omit them.
    This way you have the nicer syntax.
*/

    //lambda expression
    //lambda expression is always surrounded by curly braces

    //lambda syntax
    //{x, Int, y: Int -> x + y}
    //---------------parameters
    //               -> arrow
    //                  -------body


    //lambda as a function argument
    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    list.any({i:Int-> i > 5}) //lambda as a function argument
    list.any() {i:Int-> i > 5} //when lambda is the last argument, you can move it out of parentheses
    list.any {i:Int-> i > 5} // if the parentheses are empty, you can omit them
    list.any{ i -> i > 5} // if the type can be inferred, if it is clear from context, you can omit it
    list.any{ it > 5} // if there is only one parameter, you can use it instead of specifying the parameter name, it denotes the only parameter

    // multiline lambda
    list.any {
        println("processing $it")
        it > 5
    }
    // if the lambda is multiline, the last expression is the result of the lambda

    //Destructoring declarations
    // if your lambda takes a pair of values as arguments, or as in this case map entry, you can use so called destructuring declarations
    val map = mapOf(1 to "one", 2 to "two")
    map.mapValues { entry -> "${entry.key} -> ${entry.value}!"}

    map.mapValues { (key, value) -> "$key -> $value!"} // destructuring declarations
    // you can declare two variables inside the parentheses, and the first one will be assigned the key, and the second one will be assigned the value
    // compiler will automatically desctruct the entry into key and value

    // if one of the parameters is not used, you can use underscore to denote that you don't need it
    map.mapValues { (_, value) -> "$value!"}

}