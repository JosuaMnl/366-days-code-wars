// Day 68/366
// https://www.codewars.com/kata/5d50e3914861a500121e1958

// My Answers
fun addLetters(arr: List<Char>) = arr.map { it.code - '`'.code }

fun main() {
    println(addLetters(listOf('a', 'b', 'c'))) // 'f'
    println(addLetters(listOf('z'))) // 'z'
    println(addLetters(listOf('a', 'b'))) // 'c'
    println(addLetters(listOf('c'))) // 'c'
    println(addLetters(listOf('z', 'a'))) // 'a'
    println(addLetters(listOf('y', 'c', 'b'))) // 'd'
    println(addLetters(listOf())) // 'z'
}
