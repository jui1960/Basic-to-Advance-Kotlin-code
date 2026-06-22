import java.util.*

fun main(args: Array<String>) {



    val input = readLine()!!.split(" ")
    val x = input[0].toInt()
    val y = input[1].toDouble()

    val total = when (x) {
        1 -> 4.00 * y
        2 -> 4.50 * y
        3 -> 5.00 * y
        4 -> 2.00 * y
        else -> 1.50 * y
    }

    println(String.format(Locale.US, "Total: R$ %.2f", total))


}