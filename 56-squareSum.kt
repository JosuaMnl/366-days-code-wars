// Day 56/366
// https://www.codewars.com/kata/515e271a311df0350d00000f

// My Answers
fun squareSum(n: Array<Int>) = n.fold(0) { curr, acc -> curr + (acc*acc) }

// Best Practices
// fun squareSum(n: Array<Int>) = n.sumOf { it * it }

fun main() {
    println(squareSum(arrayOf(1, 2)))
    println(squareSum(arrayOf(0, 3, 4, 5)))
    println(squareSum(arrayOf()))
}