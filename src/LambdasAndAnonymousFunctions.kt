/**
 * Small chunks of code that can be passed to other functions
 *
 * Removes the need to declare a function, and instead, it gives us the ability to
 * pass a block of code directly as a function parameter
 *
 * **/

class LambdasAndAnonymousFuns {

    private val people = listOf(Person("John", 30), Person("Anne", 28), Person("Toby", 32))

    fun findOldest(): Person? {
        var maxAge = 0;
        var oldest: Person? = null
        for (person in people) {
            if (person.age > maxAge) {
                maxAge = person.age
                oldest = person
            }
        }

        return oldest
    }

    fun coolFindOldest(): Person? {
        // A
        val oldestA = people.maxBy(fun(p: Person): Int = p.age)

        // B
        val oldestB = people.maxBy(fun(p: Person): Int { return p.age })

        return oldestB

        /**
         *
         * Return type inferred when using expression body (A)
         * Return type must be specified when using block body (B), otherwise is `Unit`
         * Arguments must always be passed inside parentheses
         * `return` returns from the anonymous function itself
         *
         * **/
    }

    fun coolerFindOldest(): Person? {
        // Where's the lambda?
        // What's the lambda's signature?
        return people.maxBy { p: Person -> p.age }

        /**
         *
         * Return type must is inferred and can't be specified
         * `return` returns from the enclosing function (declared with `fun`)
         *
         * **/
    }

    fun findPersonMemberReference(): Person? {
        return people.maxBy(Person::age)
    }

    fun lambdaSyntax() {
        val mySum = { x: Int, y: Int -> x + y }

        // How to call it?
        println(mySum(1, 3))
        println({ x: Int, y: Int -> x - y }(4, 3))
    }

    fun lambdasAsArguments() {
        people.joinToString(", ", transform = { p: Person -> p.name })
        people.joinToString(", ", transform = { p -> p.name })
        people.joinToString(", ") { p -> p.name }
        people.joinToString(", ") { it.name }
    }

    fun lambdasInVariables() {
        val getAge = { p: Person -> p.age }

        // Why can't we do `val getAge = {it.age}`?

        val getAge2: (Person) -> Int = { it.age }
    }

    fun destructuring() {
        val dayColours = mapOf(
                "Monday" to "Blue",
                "Tuesday" to "Yellow",
                "Wednesday" to "Purple",
                "Thursday" to "Green",
                "Friday" to "Red"
        )

        dayColours.forEach {
            println("${it.key} is ${it.value}")
        }

        dayColours.forEach { (key, value) -> println("$key is $value") }

        val colours = dayColours.map { (_, value) -> value }

        people.forEach { (name, age) -> println("$name's age is $age") }
    }
}


data class Person(val name: String, val age: Int, val nationality: String = "Canadian")