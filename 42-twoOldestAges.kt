// Day 42/366
// https://www.codewars.com/kata/511f11d355fe575d2c000001

// My Answers
fun twoOldestAges(ages: List<Int>): List<Int> {
    val sortedAges = ages.sorted()
    return sortedAges.takeLast(2)
}

// Best Practices
// fun twoOldestAges(ages: List<Int>) = ages.sorted().takeLast(2)

fun main() {
    println(twoOldestAges(listOf(1,5,87,45,8,8))) // [45, 87]
    println(twoOldestAges(listOf(6,5,83,5,3,18))) // [18, 83]
}