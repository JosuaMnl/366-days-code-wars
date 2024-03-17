// Day 53/366
// https://www.codewars.com/kata/55685cd7ad70877c23000102

// My Answers
class Kata {
    fun makeNegative(x: Int) = if (x > 0) x * -1 else x
}

// Best Practices
// class Kata {
//     fun makeNegative(x: Int) = if(x <= 0) x else -x
// }

fun main() {
    val kata = Kata()
    println(kata.makeNegative(5))
    println(kata.makeNegative(-1))
    println(kata.makeNegative(0))
}