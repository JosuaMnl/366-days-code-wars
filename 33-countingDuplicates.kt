// Day 33/366
// https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1

// My Answers
fun duplicateCount(text: String) = text.lowercase().groupBy { it }.values.count { it.size >= 2 }

fun main() {
    println(duplicateCount("abcde")) // 0
    println(duplicateCount("abcdea")) // 1
    println(duplicateCount("indivisibility")) // 1
    println(duplicateCount("ABBA")) // 2
}