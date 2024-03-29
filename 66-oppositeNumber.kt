// Day 65/366
// https://www.codewars.com/kata/56dec885c54a926dcd001095

// My Answers
fun opposite(number: Int) = number * -1

// Best Practices
// fun opposite(number: Int) = -number

fun main() {
    println(opposite(1)); // -1
    println(opposite(0)); // 0
    println(opposite(-25)); // 25
}