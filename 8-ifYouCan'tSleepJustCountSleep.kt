// Day 8/366
// https://www.codewars.com/kata/5b077ebdaf15be5c7f000077

// My Answers
fun countSheep(num: Int) =
    (1..num).map { i ->
        "$i sheep..."
    }.joinToString("")


fun main() {
    println(countSheep(3))
    println(countSheep(0))
    println(countSheep(5))
}