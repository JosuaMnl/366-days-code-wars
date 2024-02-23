// Day 30/366
// https://www.codewars.com/kata/5264d2b162488dc400000001

// My Answers
fun spinWords(sentence: String): String {
    var newWords = mutableListOf<String>()
    sentence.split(" ").forEach {
        if(it.length >= 5) newWords.add(it.reversed()) else newWords.add(it)
    }
    return newWords.joinToString(" ")
}

// Best Practices
// fun spinWords(sentence: String) = sentence.split(" ").joinToString(" ") { if(it.length > 5) it.reversed() else it }

fun main(){
    println(spinWords("This is another test"))
    println(spinWords("You are almost to the last test"))
    println(spinWords("Just kidding there is still one more"))
}