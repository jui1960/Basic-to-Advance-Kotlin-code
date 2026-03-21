fun main() {
    val n = readLine()!!.toInt()

    var bonecos = 0
    var arquitetos = 0
    var musicos = 0
    var desenhistas = 0

    repeat(n) {
        val parts = readLine()!!.split(" ")
        val group = parts[1]
        val h = parts[2].toInt()

        when (group) {
            "bonecos" -> bonecos += h
            "arquitetos" -> arquitetos += h
            "musicos" -> musicos += h
            "desenhistas" -> desenhistas += h
        }
    }

    val total = (bonecos / 8) + (arquitetos / 4) + (musicos / 6) + (desenhistas / 12)

    println(total)
}