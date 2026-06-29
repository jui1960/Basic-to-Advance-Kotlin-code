fun main() {
    val a = readLine()!!.toInt();

    for (i in 1..a){
        if(i%2==0){
            println("$i = Even")
        }
        else println("$i = Odd")
    }
}