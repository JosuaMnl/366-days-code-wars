// Day 24/366
// https://www.codewars.com/kata/563e320cee5dddcf77000158

// My Answers
fun getAverage(marks: List<Int>): Int {
    var total = 0
    marks.forEach {
        total += it
    }
    return total/marks.size
}

// Best Practices
// fun getAverage(marks: List<Int>) = marks.fold(0) { curr, item -> curr + item }/marks.size

fun main() {
    println(getAverage(listOf(2,2,2,2)))
    println(getAverage(listOf(1,2,3,4,5)))
    println(getAverage(listOf(1,1,1,1,1,1,1,2)))
    println(getAverage(listOf(1,5,87,45,8,8))) // 25
}