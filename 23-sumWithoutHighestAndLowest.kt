// Day 23/366
// https://www.codewars.com/kata/576b93db1129fcf2200001e6

// My Answers
fun sumArray(array: ArrayList<Int>?) = array?.sorted()?.slice(1..array.size-2)?.sum() ?: 0

fun main() {
    println(sumArray(null))
    println(sumArray(arrayListOf()))
    println(sumArray(arrayListOf(3)))
    println(sumArray(arrayListOf(3, 5)))
    println(sumArray(arrayListOf(6, 2, 1, 8, 10)))
    println(sumArray(arrayListOf(0, 1, 6, 10, 10)))
    println(sumArray(arrayListOf(-6, -20, -1, -10, -12)))
    println(sumArray(arrayListOf(-6, 20, -1, 10, -12)))
}