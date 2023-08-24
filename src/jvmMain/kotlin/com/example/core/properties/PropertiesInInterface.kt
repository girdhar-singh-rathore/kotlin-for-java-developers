package com.example.core.properties

/**
 * @author Girdhar Singh Rathore
 * @date Thursday, August 24, 2023, 9:50 PM
 */

interface User {
    val nickname: String
}

class FaceBookUser(val accountId: Int) : User {
    override val nickname: String = "facebook user"
}

class SubscribingUser(val email: String) : User {
    override val nickname: String
        get() = email.substringBefore('@')
}

fun main(args: Array<String>) {
    val facebookUser = FaceBookUser(1)
    println(facebookUser.nickname)

    val subscribingUser = SubscribingUser("abc@gmail.com")
    println(subscribingUser.nickname)
}