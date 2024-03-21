// Day 58/366
// https://www.codewars.com/kata/555086d53eac039a2a000083

// My Answers
fun loveFun(flowerA: Int, flowerB: Int) = flowerA % 2 != flowerB % 2

// Best Practices
// fun loveFun(flowerA: Int, flowerB: Int) = (flowerA + flowerB) % 2 != 0

fun main() {
    println(loveFun(1, 4)) // true
    println(loveFun(2, 2)) // false
    println(loveFun(0, 1)) // true
    println(loveFun(0, 0)) // false
}