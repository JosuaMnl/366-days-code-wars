// Day 39/366
// https://www.codewars.com/kata/57cebe1dc6fdc20c57000ac9

// My Answers
fun findShort(s: String): Int {
    var words = s.split(" ")
    var num = words[0].length
    words.forEach { item ->
        if (num >= item.length) {
            num = item.length
        }
    }
    return num
}

// Best Practices
// fun findShort(s: String) = s.split(" ").minOf { it.length }

fun main() {
    println(findShort("bitcoin take over the world maybe who knows perhaps")) // 3
    println(findShort("turns out random test cases are easier than writing out basic ones")) // 3
    println(findShort("Let's travel abroad shall we")) // 2
}