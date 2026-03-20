fun main() {
    val n = readLine()!!.toInt()
    val arr = readLine()!!.split(" ").map { it.toInt() }

    for (i in 1 until n) {
        if (arr[i] < arr[i - 1]) {
            println(i + 1) // 1-based index
            return
        }
    }

    println(0)
}