package com.example.core.functionalprogramming

/**
 * @author Girdhar Singh Rathore
 * @date Sunday, August 20, 2023, 7:41 PM
 */


fun main(args: Array<String>) {

    // it will print empty list because the lambda return from the function
    //when function find 0 in the list, it return an empty list from the whole function
    println(duplicateNonZero(listOf(1, 2, 3, 4, 5, 6, 7, 8, 0, 9)))

    // if you want to return from lambda, you have to use label
    // label is a name followed by @ sign

    // here return@flatMap return from the lambda and not from the function
    // by default you can use the name of function as label
    fun duplicateNonZero(list: List<Int>): List<Int> {
        return list.flatMap {
            if (it == 0) return@flatMap listOf()
            listOf(it, it)
        }
    }

    //specifying the label explicitly
    fun duplicateNonZero2(list: List<Int>): List<Int> {
        return list.flatMap l@{
            if (it == 0) return@l listOf()
            listOf(it, it)
        }
    }

    //you can use local function
    fun duplicateNonZero3(list: List<Int>): List<Int> {
        fun duplicate(i: Int): List<Int> {
            if (i == 0) return listOf()
            return listOf(i, i)
        }
        return list.flatMap(::duplicate)
    }


}


fun duplicateNonZero(list: List<Int>): List<Int> {
    return list.flatMap {
        if (it == 0) return listOf()
        listOf(it, it)
    }

    //return in kotlin always return from the function marked with the fun keyword

}