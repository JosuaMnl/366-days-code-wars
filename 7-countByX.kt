// Day 7/366
// https://www.codewars.com/kata/5513795bd3fafb56c200049e

// My Answers
fun countBy(x: Int, n: Int) = 
    1.rangeTo(n).map { 
        it * x
    }

fun main() {
    println(countBy(1, 10))
    println(countBy(2, 5))
}