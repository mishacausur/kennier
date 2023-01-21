fun main() {
enterPoint(false)
}

fun enterPoint(isNow: Boolean) {
    if (isNow == true) before() else after()
}

fun after() {
    val input = readLine()
    println("you have entered: ${input?.uppercase()}")
    val array = arrayOf("one", "two", "three")
    array.forEach { println(it) }
}

fun before() {
    makeSmth("Project started")
    sumSmth(320, 390)
    stringer()
}

fun makeSmth(text: String) {
    (text).also {
        println(it)
    }
}

fun sumSmth(firstNumber: Int, secondNumber: Int) {
    println("result of $firstNumber + $secondNumber is ${firstNumber + secondNumber}")
}

fun stringer() {
    val str = "string powerful"
    println(
        "string is now ${
            str
        .uppercase()
        .lowercase()
    }"
    )
}