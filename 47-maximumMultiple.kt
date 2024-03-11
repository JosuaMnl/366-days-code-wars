// Day 47/366
// https://www.codewars.com/kata/5aba780a6a176b029800041c

// My Answers
fun maxMultiple(d: Int, b: Int) = if (b%d==0) b else b - (b%d)    

// Best Practices
// fun maxMultiple(d: Int, b: Int) = b / d * d

fun main() {
    println(maxMultiple(2, 7))
    println(maxMultiple(3, 10))
    println(maxMultiple(7, 17))
    println(maxMultiple(10, 50))
    println(maxMultiple(37, 200))
    println(maxMultiple(7, 100))
}