fun nullableTypes() {
    val name: String
    var sport: String? = null
    sport = "Basketball"
}

fun nullChecks(runnerName: String, racesRun: Int?) {
    if (racesRun == null) {
        println("don't know if $runnerName has run any races")
    } else {
        println("$runnerName has run $racesRun races")
    }

//     val endOfYearRaces = racesRun!! + 1

    if (racesRun is Int) {
        println("$runnerName will likely have run ${racesRun + 1} at the end of the year")
    }

    if (racesRun is Int && racesRun == 0) {
        println("$runnerName is not a very avid racer")
    }
}

data class Fruit(val name: String, val type: String)

fun moreFunWithNulls() {
    val fruits = listOf(Fruit("Lemon", "Citrus"), Fruit("Blackberry", "Berry"), Fruit("Mango", "Tropical"))

    val firstCitrusFruitName: String? = fruits.firstOrNull { fruit: Fruit -> fruit.type == "Citrus" }?.name


    val firstBerryFruit: String = fruits.firstOrNull { it.type == "Berry" }?.name ?: "There are no berries"


    var tropicalFruit: String

    fruits.firstOrNull { it.type == "Tropical" }?.let { tropicalFruit = it.name }
}