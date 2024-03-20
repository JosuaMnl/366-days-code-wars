// Day 57/366
// https://www.codewars.com/kata/5a3fe3dde1ce0e8ed6000097

// My Answers
fun century(number: Int): Int {
    var result: Int
    if(number % 100 == 0) {
        result = number / 100
    } else {
        result = (number / 100) + 1
    }
    return result
}

// Best Practices
// fun century(number: Int) = (number +99) / 100

fun main() {
    println(century(1705)); // 18
    println(century(1900)); // 19
    println(century(1601)); // 17
    println(century(2000)); // 20
    println(century(89)); // 1
}