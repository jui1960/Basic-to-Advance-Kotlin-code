fun main() {
    val (p, j1, j2, r, a) = readLine()!!.split(" ").map { it.toInt() }

    if (r == 1) {
        if (a == 1) {
            println("Jogador 2 ganha!")
        } else {
            println("Jogador 1 ganha!")
        }
    } else {
        if (a == 1) {
            println("Jogador 1 ganha!")
        } else {
            val sum = j1 + j2
            if (sum % 2 == 0) { // even
                if (p == 1) println("Jogador 1 ganha!")
                else println("Jogador 2 ganha!")
            } else { // odd
                if (p == 0) println("Jogador 1 ganha!")
                else println("Jogador 2 ganha!")
            }
        }
    }
}