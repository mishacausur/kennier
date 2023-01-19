fun main() {
   makeSmth("Project started")
    sumSmth(320, 390)
}

fun makeSmth(text: String) {
    (text).also {
        println(it)
    }
}

fun sumSmth(firstNumber: Int, secondNumber: Int) {
    println("result of $firstNumber + $secondNumber is ${firstNumber + secondNumber}")
}