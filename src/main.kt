fun main() {
    println("Hello World")
    val question:Question? = Question()


    println("The answer is ${question?.Question} is ${question?.answer}")

    question?.answer = "42"

    val message =
    if(question?.answer == question?.correctAnswer) {
        "right"
    } else {
        "wrong"
    }

    println(message)



}

