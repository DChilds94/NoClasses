import kotlin.coroutines.coroutineContext

class Question {
    var answer:String? = null
    val question: String = "Question of life"
    val correctAnswer:String = "42"


    fun display() {
        println("You said $answer")}

    fun printResult() {
        when(answer) {
            correctAnswer -> println("Right")
            else -> println("Try Again")
        }
    }


}