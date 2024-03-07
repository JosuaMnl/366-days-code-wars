// Day 43/366
// https://www.codewars.com/kata/57cc981a58da9e302a000214

// My Answers
fun smallEnough(a : IntArray, limit : Int) : Boolean {
    var result = false
    a.forEach {
        if (it <= limit) {
            result = true
        } else return false
    }
    return result
}

// Best Practices
// fun smallEnough(a : IntArray, limit : Int) = a.all { it <= limit }

fun main() {
    println(smallEnough(intArrayOf(66, 101), 200)) // true
    println(smallEnough(intArrayOf(78, 117, 110, 99, 104, 117, 107, 115), 100)) // false
    println(smallEnough(intArrayOf(101, 45, 75, 105, 99, 107), 107)) // true
    println(smallEnough(intArrayOf(80, 117, 115, 104, 45, 85, 112, 115), 120)) // true
}