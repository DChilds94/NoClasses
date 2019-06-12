import java.lang.NumberFormatException

fun main() {
    println("Hello World")
    val q = Question()


    println("The answer is ${q.question} is ${q.answer}")

    q.answer = "42"
    q.printResult()

    val num:Int? = try {
        Integer.parseInt(q.answer)
    } catch (e:NumberFormatException) {
        null
    }

    println("Number is $num")

}

