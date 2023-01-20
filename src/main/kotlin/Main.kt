fun main() {
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
    println("string is now $str")
}