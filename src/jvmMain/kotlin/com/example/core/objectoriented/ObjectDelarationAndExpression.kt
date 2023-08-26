package com.example.core.objectoriented

/**
 * @author Girdhar Singh Rathore
 * @date Friday, August 25, 2023, 8:37 PM
 */

// object declaration
// object declaration is a way to define a singleton
// it is a way to define a class and create an instance of it at the same time

object KSingelton {
    fun doSomething() {
        println("do something")
    }
}

//object expression
//object expression is a way to define a class and create an instance of it at the same time
//it is similar to java anonymous inner class
//it is used if you need a class only once
//it is used if you need a class with some interface or abstract class
// a new instance of the anonymous class is created every time the object expression is executed


fun main(args: Array<String>) {
    KSingelton.doSomething()
    //calling from java
    //KSingelton.INSTANCE.doSomething()

}