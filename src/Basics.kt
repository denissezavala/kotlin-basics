/** Functions **/

fun sum(a: Int, b: Int): Int {
    val theSum = a + b
    return theSum
}

fun sameSum(a: Int, b: Int): Int = a + b

// "void" functions
fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}

fun samePrintSum(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}

/** Variables **/
fun readOnlyVariables() {
    val a: Int = 1
    val b = 2
    val c: Int
    c = 3
}

fun mutableVariables() {
    var counter = 5
    counter++
    counter = 10

    println(counter)
}

/** Strings **/

fun templates() {
    val age = 30
    val message = "Tom is $age years old"
    val newMessage = "Tom will be ${age + 1} years old next year"
}

/** Conditionals **/

fun max(a: Int, b: Int): Int {
    return if (a > b) {
        val somethingElse = ""
        a
    } else {
        b
    }
}

/** `if` is an expression **/
fun sameMax(a: Int, b: Int) = if (a > b) a else b


/** Loops **/
fun forLoop() {
    val events: List<String> = listOf("swimming", "cycling", "running")
    for (index in events.indices) {
        println("event number $index in a triathlon is ${events[index]}")
    }
}

/** When **/
    fun whenz(name: String, sport: Any) {
        val personKind = when (sport) {
            "swimming" -> "swimmer"
            is Number -> "accountant"
            !is String -> "don't know"
            else -> "not a sports person"
        }

        println("$name is a $personKind")
    }

/** Ranges **/
fun range() {
    for (i in 1..10) { // 1 and 10 are included in the range
        println(i)
    }

    println("--------------------------")

    for (i in 10 downTo 1) {
        println(i)
    }
}

fun isInRange(x: Int) {
    if (x in 1..x+1) {
        println("fits in range")
    }
}

fun collectionRanges() {
    val list = listOf("a", "b", "c")

    if (50 !in 0..list.lastIndex) {
        println("-1 is out of range")
    }
    if (list.size !in list.indices) {
        println("list size is out of valid list indices range too")
    }
}

/** Collections **/
fun collections() {
    val colours =  listOf("red", "green", "blue", "purple", "gray")
    colours.forEach { println(it) }

    println("colour count: ${colours.filter { it.startsWith("g") }.count()}")
    println("colour count: ${colours.count { it.startsWith("g") }}")

    println("first colour in the list ${colours.first()}")
    println("first colour with three characters ${colours.first { colour -> colour.length == 3 }}")
    println("first colour with 6 characters ${colours.firstOrNull { it.length == 6 }}")

    println("all colours start with g: ${colours.all { it.startsWith("g") }}")
}

fun mutableCollections() {
    var list = emptyList<Int>()
    list = listOf(1, 2, 3)
//    list.add(4)

    val mutableList = mutableListOf(-1, 0)
    mutableList.add(1)
    mutableList.addAll(listOf(3, 4, 5, 6))
    println(mutableList)

}