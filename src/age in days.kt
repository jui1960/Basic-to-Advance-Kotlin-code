import java.util.*
fun main(args: Array<String>) {
    var days = readLine()?.toInt() ?: 0

    val years = days / 365
    days %= 365

    val months = days / 30
    days %= 30


    println("$years ano(s)\n$months mes(es)\n$days dia(s)")
}