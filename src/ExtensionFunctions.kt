/**
 *
 * Extend a class with new functionality without having to inherit
 * from the class or use any type of design pattern such as Decorator
 *
 **/

// receiver type

fun <T> MutableList<T>.replaceAtIndex(index: Int, value: T) {
    this[index] = value
}


open class Animal

class Cow: Animal()

fun Animal.think() = println("I'm an animal")

fun Cow.think() = println("I'm a cow")



class Clown {
    fun foo() { println("member") }
}

fun Clown.foo() { println("extension") }


class Mime {
    fun foo() { println("member") }
}

fun Mime.foo(i: Int) { println("extension") }



fun Any?.toString(): String {
    if (this == null) return "null"

    return toString()
}



val <T> List<T>.lastIndex: Int
    get() = size - 1







/**
 *
 * The extension function being called is determined
 * by the type of the expression on which the function is invoked,
 * not by the type of the result of evaluating that expression at runtime
 *
 */
