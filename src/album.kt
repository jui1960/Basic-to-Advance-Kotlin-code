fun main() {
    // মোট স্টিকারের সংখ্যা (N)
    val n = readln().toInt()

    // কেনা স্টিকারের সংখ্যা (M)
    val m = readln().toInt()

    // ডুপ্লিকেট বাদ দেওয়ার জন্য MutableSet
    val purchasedCards = mutableSetOf<Int>()

    for (i in 1..m) {
        // প্রতিটি স্টিকারের নম্বর ইনপুট নেওয়া
        val card = readln().toInt()
        purchasedCards.add(card)
    }

    // রেজাল্ট প্রিন্ট করা
    val missingCards = n - purchasedCards.size
    println(missingCards)
}