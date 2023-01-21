fun main() {
    log("Candy", "Apple", "Car")
}

fun log(vararg entries: String) {
    printStrings(*entries)
}

fun printStrings(vararg strings: String) {
    strings.forEach { println(it.uppercase()) }
}

fun listChecker() {
    val cities = listOf<String>("Los_Angeles", "New-York", "Berlin", "London")
    cities
        .filter { it.startsWith("L") }
        .sortedBy { it }
        .map { it.uppercase() }
        .forEach {(println(it))}
}

fun arrayChecker() {
    val array = arrayOf("one", "two", "three", "four")
    /* checks the only first */
    when {
        "two" in array -> println("there is 2 in array")
        "four" in array -> println("and now it has four")
    }
}