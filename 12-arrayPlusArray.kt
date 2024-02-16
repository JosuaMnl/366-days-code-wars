// Day 12/366
// https://www.codewars.com/kata/5a2be17aee1aaefe2a000151

// My Answers
fun arrayPlusArray(arr1: Array<Int>, arr2: Array<Int>) : Int {
    var total = 0
    fun loopArray(arr: Array<Int>) {
        for (i in 0..arr.size - 1) {
            total += arr[i]
        }
    }

    loopArray(arr1)
    loopArray(arr2)
    return total
}

// Best Practices
// fun arrayPlusArray(arr1: List<Int>, arr2: List<Int>) = listOf(*arr1, *arr2).fold(0) { curr, item -> curr + item}

fun main() {
    println(arrayPlusArray(arrayOf(1, 2, 3), arrayOf(4, 5, 6)))
    println(arrayPlusArray(arrayOf(-1, -2, -3), arrayOf(-4, -5, -6)))
    println(arrayPlusArray(arrayOf(0, 0, 0), arrayOf(4, 5, 6)))
    println(arrayPlusArray(arrayOf(100, 200, 300), arrayOf(400, 500, 600)))
}