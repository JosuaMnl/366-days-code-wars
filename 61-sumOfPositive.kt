// Day 61/366
// https://www.codewars.com/kata/5715eaedb436cf5606000381

// My Answers
fun sum(numbers: IntArray) = numbers.filter { it > 0 }.fold(0) { acc, curr -> acc + curr }

// Best Practices
// fun sum(numbers: IntArray) = numbers.filter { it > 0 }.sum()

fun main() {
    println(sum(intArrayOf(1, 2, 3, 4, 5))) // 15
    println(sum(intArrayOf(1, -2, 3, 4, 5))) // 13
    println(sum(intArrayOf())) // 0
    println(sum(intArrayOf(-1, -2, -3, -4, -5))) // 0
    println(sum(intArrayOf(-1, 2, 3, 4, -5))) // 9
}