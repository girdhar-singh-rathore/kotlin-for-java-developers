package com.example.core.inlinefunctions

/**
 * @author Girdhar Singh Rathore
 * @date Sunday, August 27, 2023, 6:21 PM
 */

// regular run function
fun myRun(f: () -> Unit) = f()

fun main(args: Array<String>) {
    val name = "Arya"

    //bring the performance
    myRun { println("hi $name") }

    //in comparison to
    println("hi $name")

    // under the hood to store the lambda, annonymous class is created
    // if the lambda capture some variables, then a new object is created to store the content of captured variables
    // for each invocation, that is an quite overhead for such a simple case in terms of performance

    //in comparison with simply writing the code with run function with lambda that would be considerable difference
    // if we define the run function like this than probably there would be style guide that would recommend don't use
    // run any performance critical part of code , use it with care, be aware that under the hood there is an annonymous class

    //with inline function, it is no longer the case

    //inline function
    //compiler substitutes the body of function instead of calling the function
    // if the inline function take lambda as an argument, only call this lembda inside, than inling will substitute
    // the body of the lambda instead of calling the lambda

    //inline fun <R> run(block: () -> R): R = block()
    run { println("hi $name") }
    //generated code will be
    //println("hi $name")

    //as result no performance overhead

    //no performance overhead when using run, let, takeIf, takeUnless, repeat, synchronized, etc

    //@InlineOnly annotation
    //if you want to make sure that the function is inlined, you can annotate it with @InlineOnly
    //this functions can't be called from java


    //main disadvantage of inline function is that it increases the size of the bytecode
    //only small functions should be inlined
    //jvm hot spot compiler can inline the function if it is called frequently




}