// Day 1/366
// https://www.codewars.com/kata/57f780909f7e8e3183000078/

// My Answers
fun grow(arr: IntArray): Int {
    var result = arr[0]
    for (i in 1..arr.size-1){
        result *= arr[i]
    }
    return result
}

// Best Practices
// fun grow(arr: IntArray) = arr.reduce(Int::times)

fun main() {
    val result = grow(intArrayOf(1,2,3));
    println(result)
}