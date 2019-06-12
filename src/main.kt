import java.lang.NumberFormatException
import java.util.*

fun main() {

    var ages = TreeMap<String, Int>()
    ages["Daniel"] = 24
    ages["Wiktoria"] = 22
    ages["Oliver"] = 20
    ages["Sophie"] = 27
    ages["Will"] = 33

    var numbers = listOf(1,2,3,4,5)

    for((name, age) in ages ) {
        println("$name is $age")
    }

    for ((index, element) in numbers.withIndex()) {
        println("$element at $index")
    }

    var myValues = 1..10
    for(i in myValues) {
        println(i)
    }

    for(i in myValues step 2) {
        println(i)
    }

    for (i in myValues.reversed()) {
        println(i)
    }





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

