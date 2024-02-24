// Day 31/366
// https://www.codewars.com/kata/58235a167a8cb37e1a0000db

// My Answers
fun numberOfPairs(gloves:List<String>) : Int {
    var colors = gloves.toSet()
    var pairs = 0
    colors.forEach { color ->
        var count = gloves.count {
            it == color
        }
        println(count)
        if (count >= 2) {
            if (count % 2 == 0) {
                pairs += count
            } else {
                pairs += count - 1
            }
        }
        println("Pairs $pairs")
    }
    return pairs / 2
}

// Best Practices
// fun numberOfPairs(gloves:List<String>) = gloves.groupBy { it }.values.sumOf { it.size / 2 }

fun main() {  
    println(numberOfPairs(arrayOf("green","red","red","green").toList()))
    println(numberOfPairs(arrayOf("red","green","blue").toList()))
    println(numberOfPairs(arrayOf("gray","black","purple","purple","gray","black").toList()))
    println(numberOfPairs(emptyList<String>()))
    println(numberOfPairs(arrayOf("red","green","blue","blue","red","green","red","red","red").toList()))
}