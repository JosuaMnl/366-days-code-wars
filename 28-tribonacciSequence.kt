// Day 28/366
// https://www.codewars.com/kata/556deca17c58da83c00002db

// My Answers
fun tribonacci(signature: DoubleArray, n: Int): DoubleArray {
    var result = signature.clone().toMutableList()
    var start = 0
    var finish = 2
    if (n == 0) {
        return doubleArrayOf()
    } else if (n == 1) {
        return doubleArrayOf(result[0])
    }
    for (i in 0..n-4) {
        var nextElement = 0.0
        for (j in start..finish) {
            nextElement += result[j]
        }
        result.add(nextElement)
        start += 1
        finish += 1
    }
    return result.toDoubleArray()
}

// Best Practices
// fun tribonacci(signature: DoubleArray, n: Int) = generateSequence(Triple(signature[0], signature[1], signature[2])) { 
//     Triple(it.second, it.third, it.first + it.second + it.third) }
//     .map { it.first }
//     .take(n)
//     .toList()
//     .toDoubleArray()

fun main() {
    println(tribonacci(doubleArrayOf(1.0,1.0,1.0),3))
    println(tribonacci(doubleArrayOf(1.0,1.0,1.0),10))
    println(tribonacci(doubleArrayOf(0.0,0.0,1.0),10))
    println(tribonacci(doubleArrayOf(0.0,1.0,1.0),10))
}