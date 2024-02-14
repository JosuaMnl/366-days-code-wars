// Day 9/366
// https://www.codewars.com/kata/577a98a6ae28071780000989

// My Answers
fun min(list: List<Int>): Int {
    var minValue = list[0]
    for (i in 1..list.size - 1) {
        if (minValue >= list[i]) minValue = list[i]    
    }
    return minValue
}

fun max(list: List<Int>): Int {
    var maxValue = list[0]
    for (i in 1..list.size - 1) {
        if (maxValue <= list[i]) maxValue = list[i]
    }
    return maxValue
}

// Best Practices
// fun max(list: List<Int>) = list.max()
// fun min(list: List<Int>) = list.min()

fun main() {
    println(min(listOf(4,6,2,1,111,9,63,-134,566)))
    println(max(listOf(4,6,2,1,111,9,63,-134,566)))
}