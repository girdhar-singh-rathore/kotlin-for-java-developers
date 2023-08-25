package com.example.core.objectoriented

/**
 * @author Girdhar Singh Rathore
 * @date Friday, August 25, 2023, 7:44 AM
 */


//below will generator a default constructor
class Consumer

// primary constructor
data class Consumer2 constructor(val name: String, val age: Int)

// full primary constructor syntax

//when you use val or var in constructor, it will automatically create a property with the same name
// without the val or var, it will not create a property
class Consumer4( somename :String){

    val name: String
    init {
        println("init block")
        this.name = somename
    }

    fun printAndGet(): String {
        println("getter")
        return name
    }
}
// can be written as
class Consumer5( val name: String)


//changing the visibility of constructor
class InternalConsumer internal constructor(val name: String)


//secondary constructor
class Consumer3(val name: String) {
    var age: Int = 0

    constructor(name: String, age: Int) : this(name) {
        this.age = age
    }
}

//same syntax is use to extend and implement which is :
// class SubClass : SuperClass, Interface1, Interface2

open class Parent(val name: String)
class Child(name: String, val age: Int) : Parent(name)

//user the super keyword to call the parent constructor from the secondary constructor
class Child2: Parent{
    constructor(name: String) : super(name)
}

fun main(args: Array<String>) {
    val consumer2 = Consumer2("some name", 25)
    println(consumer2)

    val consumer4 = Consumer4("parameter name")
    println(consumer4.printAndGet())
}

