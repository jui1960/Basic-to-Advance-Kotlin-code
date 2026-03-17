fun main() {
    val t = readLine()!!.toInt()

    repeat(t) {
        val s = readLine()!!

        if (s == "P=NP") {
            println("skipped")
        } else {
            val parts = s.split("+")
            val a = parts[0].toInt()
            val b = parts[1].toInt()

            println(a + b)
        }
    }
}