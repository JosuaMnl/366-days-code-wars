// Day 21/366
// https://www.codewars.com/kata/514b92a657cdc65150000006

// My Answers
fun solution(number: Int) =(1..number-1).asSequence().filter { it % 3 == 0 || it % 5 == 0 }.sum()

// Best Practices
// fun solution(number: Int): Int = (3 until number step 3).union((5 until number step 5)).sum()

fun main() {
    println(solution(10))
    println(solution(20))
    println(solution(200))
}