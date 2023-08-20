package com.example.core.functionalprogramming

/**
 * @author Girdhar Singh Rathore
 * @date Saturday, August 19, 2023, 10:37 PM
 */

fun main(args: Array<String>) {
    //fileter
    val list = listOf(1, 2, 3, 4, 5)
    println("list = $list")
    val evenList = list.filter { it % 2 == 0 }
    // [1,2,3,4,5] => [2,4]
    println("evenList is $evenList")

    //map transform each element in a collection and stores the result in a new collection
    // [1,2,3,4,5] => [1,4,9,16,25]
    //resulting collection has the same size as the original collection
    val doubledList = list.map { it * it }
    println("doubledList: $doubledList")

    //convert list to map
    val map = list.map { it to it * it }
    println("map: $map")

    // there are several predicates that check whether all, any or none of the elements satisfy a given predicate
    //check at least one even number is present in the list
    val isAnyEven = list.any { it % 2 == 0 }
    println("isAnyEven: $isAnyEven")

    //all check whether all elements satisfy the given predicate
    val isAllEven = list.all { it % 2 == 0 }
    println("isAllEven: $isAllEven")
    //none check whether there are no elements that satisfy the given predicate
    val isNoneEven = list.none { it % 2 == 0 }
    println("isNoneEven: $isNoneEven")

    // find returns the first element satisfying the given predicate or null if there is no such element
    val firstEven = list.find { it % 2 == 0 }
    //you can use firstOrNull, it is same as find
    println("firstEven: $firstEven")

    //first returns the first element satisfying the given predicate or throws NoSuchElementException if there is no such element
    //val first = list.first { it % 10 == 0 }
    //println("first: $first")

    //count returns the number of elements matching the given predicate
    val count = list.count { it % 2 == 0 }
    println("count: $count")

    //partition divide the collection into two collections according to a predicate
    //the first collection contains elements for which the predicate yielded true
    //the second collection contains elements for which the predicate yielded false
    val (even, odd) = list.partition { it % 2 == 0 }
    println("even: $even")
    println("odd: $odd")

    //groupBy - if you need to divide a collection into more than two groups
    //argument your provide the way how to group the elements
    //the result is a map where the keys are the groups and the values are the lists of elements in the groups
    val words = listOf("a", "abc", "ab", "def", "abcd")
    val byLength = words.groupBy { it.length }
    println("byLength: $byLength")

    val names = mapOf("alice" to 21, "bob" to 25, "charlie" to 25, "dan" to 25)
    val byAge = names.map { it.key to it.value }.groupBy { it.second }
    println("byAge: $byAge")

    data class Person(val name: String, val age: Int)

    val people = listOf(Person("Alice", 21), Person("Bob", 25), Person("Charlie", 25), Person("Dan", 25))
    val byAge1 = people.groupBy { it.age }
    println("byAge1: $byAge1")

    // this often the case that, as a result of grouping, you would prefer one element instead of list,
    // if the key is unique that it's more useful to use have a map of key to this unique element as result.
    // to do this, you can use associateBy
    // it also performs grouping but is return a one element as the map value instead of a list
    // if there are several elements with the same key, the last one wins
    // duplicate are removed
    val people1 = listOf(Person("Alice", 21), Person("Bob", 25), Person("Charlie", 25), Person("Dan", 25))
    val associateBy = people1.associateBy { it.age }
    println("associateBy: $associateBy")

    // you can use associate to build a map based on list elements
    // associate takes a function that returns a Pair of keys and values
    val associateMap = people1.associate { it.name to it.age }
    println("associateMap: $associateMap")

    //zip
    //zip provide you with a way to organize a couple of lists, it zips like zipper the elements from two lists
    // it returns a list of pairs where each pair contains one element from each list, if the lists have different sizes,
    // the result list will have the size of the smaller collection
    val list1 = listOf(1, 2, 3, 4, 5)
    val list2 = listOf("a", "b", "c")
    val zip = list1.zip(list2)
    println("zip: $zip")

    //zipWithNext
    //zipWithNext is a special case of zip, it returns a list of pairs where each pair contains two consecutive
    // elements from the original list
    val zipWithNext = list1.zipWithNext()
    println("zipWithNext: $zipWithNext")

    //flatten is extension function on collection of collections, that must be called on list of lists
    //it combines all the elements from the nexted lists and returns a single list of elements
    val listOfLists = listOf(listOf(1, 2, 3), listOf(4, 5, 6), listOf(7, 8, 9))
    val flatten = listOfLists.flatten()
    println("flatten: $flatten")

    //flatMap
    //it combines two operations map and flat, the argument to flatMap must be a lambda that convert the each
    // initial element to a list
    val namesList = listOf("Alice", "Bob", "Charlie")
    val flatMap = namesList.flatMap { it.toList() }
    println("flatMap: $flatMap")

}