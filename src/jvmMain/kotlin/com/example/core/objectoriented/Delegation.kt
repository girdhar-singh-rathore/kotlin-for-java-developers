package com.example.core.objectoriented

/**
 * @author Girdhar Singh Rathore
 * @date Friday, August 25, 2023, 8:18 PM
 */

data class Customer(val name: String, val city: String)

//let say we have a couple of interfaces
interface Repository {
    fun getById(id: Int): Customer
    fun getAll(): List<Customer>
}

interface Logger {
    fun logAll()
}

//and we have class that implements those interfaces by delegating to some properties
//instead of implementing all the method, we need to just delegate to some other instances
//you can write this code by hand or generate the delegating methods, they are trivial
//there might be more of them if the interfaces are larger and all the matters just delegate
//all the implementation to other instances
class Controller(
    val repository: Repository,
    val logger: Logger,
) : Repository, Logger {

    override fun getById(id: Int) = repository.getById(id)

    override fun getAll() = repository.getAll()

    override fun logAll() = logger.logAll()
}

//class Delegation
//This 'by' means delegating the following instance
//it allow you to delegate the task of generating the trivial matters to the compiler
//Not that controller1 class implements the both interfaces so we can call members on it

class Controller1(
    val repository: Repository,
    val logger: Logger,
): Repository by repository, Logger by logger