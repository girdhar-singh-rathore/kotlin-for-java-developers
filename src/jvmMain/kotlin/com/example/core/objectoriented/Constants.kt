package com.example.core.objectoriented

/**
 * @author Girdhar Singh Rathore
 * @date Sunday, August 27, 2023, 7:41 AM
 */
// constants
// constants are defined at compile time
// constants are defined using const modifier
// const modifier used to define premitive type and string type constants

const val MY_CONSTANT = 1


// @JvmField exposes a kotlin property as a public field

@JvmField
val MY_CONSTANT2 = Customer("yan","moon")
//same as java
//public static final Customer MY_CONSTANT2 = new Customer("yan","moon")
// this field can be accessed from java code

//if @jvmField is top level or inside a object then, static field is created
//if @jvmField is inside a class then, instance field is created

//below will create static field
object Constants{
    @JvmField
    val MY_CONSTANT3 = 1
}

//below will create instance field
class Constants2{
    companion object {
        @JvmField
        val MY_CONSTANT4 = 1
    }
}


fun main(args: Array<String>) {
    println(MY_CONSTANT)
    println(MY_CONSTANT2)
    println(Constants.MY_CONSTANT3)
    println(Constants2.MY_CONSTANT4)
}