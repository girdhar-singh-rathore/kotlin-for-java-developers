package com.example.core.functionalprogramming

/**
 * @author Girdhar Singh Rathore
 * @date Sunday, August 20, 2023, 4:36 PM
 */

fun main(args: Array<String>) {

    // member reference
    // like java kotlin has member references,  which can replace simple lambdas that only call a member function
    // or return a member property
    // :: is used to reference a function or property by name
    // first goes the class name, then ::, and then the member name
    data class Person(val name: String, val age: Int) {
        fun isOlder(ageLimit: Int) = age > ageLimit
    }

    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    println("people maxBy using lambda: ${people.maxBy { it.age }}")
    println("people maxBy using member reference: ${people.maxBy(Person::age)}")

    // you can store a lambda in a variable but you can't store a function in a variable
    val isEven = { i: Int -> i % 2 == 0 }
    val isEvenFunction = isEven

    fun isEven(i: Int): Boolean = i % 2 == 0

    // you can't store a function in a variable so you can use member reference instead
    val predicate = ::isEven


    //Passing function reference as an argument
    //whenever your lambda tends to be too long, you can extract it into a separate function and pass it as an argument
    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    list.any(::isEven)
    list.filter(::isEven)


    //bound and non bound reference
    val agePredicate = Person::isOlder
    // same as
    val agePredicate2: (Person,Int) -> Boolean = { person: Person, ageLimit: Int -> person.isOlder(ageLimit) }
    //it is not bound to any specific instance of the Person class

    //bound reference, is attached to a specific instance
    val alice = Person("Alice", 29)
    val boundAgePredicate = alice::isOlder
    // same as
    val boundAgePredicate2: (Int) -> Boolean = { ageLimit: Int -> alice.isOlder(ageLimit) }
    // member reference can be bound to this

}