// Day 49/366
// https://www.codewars.com/kata/57eb8fcdf670e99d9b000272

// My Answers
fun high(str: String) : String {
    val lstStr = str.split(" ")
    var highScore = getScore(lstStr[0])
    var result = lstStr[0]
    for (i in 1..lstStr.size - 1) {
        val score = getScore(lstStr[i])
        if (highScore < score) {
            highScore = score
            result = lstStr[i]
        }
    }
    return result
}

fun getScore(str: String) : Int {
    return str.sumOf { it.code - 96 }
}

// Best Practices
// fun high(str: String) = str.split(" ").maxBy { it.sumOf { it - 'a' + 1 } }

fun main() {
    println(high("man i need a taxi up to ubud")) // "taxi"
    println(high("what time are we climbing up the volcano")) // "volcano"
    println(high("take me to semynak")) // "semynak"
    println(high("aa b")) // "aa"
    println(high("b aa")) // "b"
    println(high("bb d")) // "bb"
    println(high("d bb")) // "d"
    println(high("aaa b")) // "aaa"
}