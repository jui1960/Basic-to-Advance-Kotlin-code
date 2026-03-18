fun main(args: Array<String>) {
    val t = readLine()!!.toInt()
    var male =0
    var female =0
    repeat(t){

    val(a,b)=readLine()!!.split(" ")

        if(b=="F"){
            female++
        }
        else{
            male++
        }
    }
    println("${male} carrinhos\n${female} bonecas")

}