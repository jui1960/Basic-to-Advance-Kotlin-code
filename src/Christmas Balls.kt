fun main(args: Array<String>) {
    val x = readLine()!!.toInt()
    val y = readLine()!!.toInt()
    val ans = y/2;
    if(ans>x){
        println("Faltam ${ans-x} bolinha(s)")
    }
    else println("Amelia tem todas bolinhas!")
}