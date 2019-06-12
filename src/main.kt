fun main() {
    println("Hello World")
    val q = Question()


    println("The answer is ${q.question} is ${q.answer}")

    q.answer = "42"
    q.printResult()



}

