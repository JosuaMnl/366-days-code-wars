// Day 16/366
// https://www.codewars.com/kata/554b4ac871d6813a03000035

// My Answers
fun highAndLow(numbers: String): String {    
    var numberInt = numbers.split(" ").map { it.toInt() }
    var high = numberInt[0]
    var low = numberInt[0] 
    numberInt.forEach { 
        if (it >= high) high = it
        if (it <= low) low = it
    }

    return "$high $low";
} 

// Best Practices
// fun highAndLow(numbers: String): String {
// 	val x = numbers.split(" ").map { it.toInt() }.sorted()
// 	return "${x.last()} ${x.first()}"
// }

fun main() {
    println(highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"))
    println(highAndLow("1 2 3"))
}