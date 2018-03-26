/**
 *
 * A function that takes another function as an argument or returns one
 *
 * **/

class HigherOrderFunctions {

    private val people = listOf(Person("John", 15), Person("Anne", 28, "Cuban"), Person("Toby", 32))

    fun wisePeople() {
        // Where's the HOF? Why is it one?
        people.first { it.age > 30 }
    }

    fun findPeopleBy(predicate: (Person) -> Boolean): List<Person> {
        return people.filter(predicate)
    }

    fun findSomePeople() {
        val young = findPeopleBy { it.age < 20 }

        val cuban = findPeopleBy { it.nationality == "Cuban" }
    }

    fun buildGreeter(inEnglish: Boolean): (String) -> String {
        return if (inEnglish) {
            { name: String -> "Hello, $name!" }
        } else {
            { name: String -> "Hola, $name!" }
        }
    }

    fun greetTomInEnglish() {
        val greet = buildGreeter(inEnglish = true)
        println(greet("Tom"))
    }

    fun greetLuisInspanish() {
        val greet = buildGreeter(inEnglish = false)
        println(greet("Luis"))
    }


}



