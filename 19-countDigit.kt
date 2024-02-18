// Day 19/366
// https://www.codewars.com/kata/566fc12495810954b1000030

// My Answers
fun nbDig(n:Int, d:Int) = (0..n).map { it * it }.joinToString("").count { "$it" == "$d" }

// Best Practices
// fun nbDig(n: Int, d: Int) = (0..n).joinToString { "${it * it}" }.count { "$it" == "$d" }

fun main() {
    println(nbDig(10, 1))
    println(nbDig(11011, 2))
}