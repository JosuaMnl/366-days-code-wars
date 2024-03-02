// Day 38/366
// https://www.codewars.com/kata/53dbd5315a3c69eed20002dd

// My Answers
fun filterList(l: List<Any>) = l.filterIsInstance<Int>()

fun main() {
    println(filterList(listOf(1, 2, 3, "B", "A")))
    println(filterList(listOf(25, 33, 98, 225, "Hello World", "Ini Str")))
}