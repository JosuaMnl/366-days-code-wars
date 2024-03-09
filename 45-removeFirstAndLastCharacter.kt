// Day 45/366
// https://www.codewars.com/kata/56bc28ad5bdaeb48760009b0

// My Answers
fun removeChar(str: String) = str.drop(1).dropLast(1)

fun main() {
    println(removeChar("eloquent"))
    println(removeChar("country"))
    println(removeChar("person"))
    println(removeChar("place"))
}