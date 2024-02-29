// Day 36/366
// https://www.codewars.com/kata/5648b12ce68d9daa6b000099

// My Answers
fun people(busStops: Array<Pair<Int, Int>>) : Int {
    var people = 0
    busStops.forEach { 
        people += it.first
        people -= it.second
    }
    return people
}

// Best Practices
// fun people(busStops: Array<Pair<Int, Int>>) = busStops.sumOf { it.first - it.second }

fun main() {
    println(people(arrayOf(3 to 0,9 to 1,4 to 10,12 to 2,6 to 1,7 to 10)))
}