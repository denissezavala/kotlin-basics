enum class Direction {
    NORTH, SOUTH, WEST, EAST
}

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

fun printColors() {
    Color.values().forEach { println(it) }
}

fun printColorRGBs() {
    Color.values().forEach { println(it.rgb) }
}

enum class CoolColor(feel: String) {
    YELLOW("happy"){
        override fun printMood() {
            println("Yellow like the sun")
        }
    },
    PURPLE("relaxed"){
        override fun printMood() {
            println("Purple is so mellow, more than yellow")
        }
    },
    BLUE("sad"){
        override fun printMood() {
            println("Blues, I've got the blues!")
        }
    },
    RED("angry"){
        override fun printMood() {
            println("Red, fiery red")
        }
    };

    abstract fun printMood()
}


