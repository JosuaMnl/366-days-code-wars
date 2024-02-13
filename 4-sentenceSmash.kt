// Day 4/366
// https://www.codewars.com/kata/53dc23c68a0c93699800041d

// My Answers
fun smash(words: ArrayList<String>): String {
    var sentence = ""
    for (i in 0..words.size - 1) {
        sentence += words[i]
        if (i != words.size - 1) {
            sentence += " "
        }
    }
    return sentence;
}

// Best Practices
// fun smash(words: List<String>) = words.joinToString(" ")

fun main() {
    println(smash(arrayListOf("Hello", "World")))
}