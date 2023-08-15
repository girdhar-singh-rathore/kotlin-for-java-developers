package com.example.core.extensions

/**
 * @author Girdhar Singh Rathore
 * @date Tuesday, August 15, 2023, 9:17 PM
 */

// extensions to child and parent
// extension function is resolved statically
// under the hood, extension function is a static java function
// there is no overriding for extension functions
// it only uses the type of the variable, not the actual object

open class Parent

class Child : Parent()

fun Parent.foo() = "parent"
fun Child.foo() = "child"

// Member vs Extension
// member function always wins

fun String.get(index: Int) = '*'

//Extensions don't hide members
class A {
    fun foo() {
        println("member")
    }
}

//compiler waring
//Extension is shadowed by a member: public final fun foo(): Unit
fun A.foo() {
    println("extension")
}

// extensions can overload members
fun A.foo(i: Int) {
    println("extension")
}

fun main(args: Array<String>) {
    val parent: Parent = Child()
    println(parent.foo())

    println("abc".get(1))
    println(A().foo())
    println(A().foo(1))
}


