import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    // EOF পর্যন্ত পড়ার জন্য
    while (sc.hasNext()) {
        val a = sc.next()[0] // প্রথম ক্যারেক্টার
        val b = sc.next()[0] // দ্বিতীয় ক্যারেক্টার
        val c = sc.next()[0] // তৃতীয় ক্যারেক্টার

        // প্যাটার্ন ৫: A = a, B = b, C = c
        println("A = $a, B = $b, C = $c")

        // প্যাটার্ন ৬: A = b, B = c, C = a
        println("A = $b, B = $c, C = $a")

        // প্যাটার্ন ৭: A = c, B = a, C = b
        println("A = $c, B = $a, C = $b")
    }
}