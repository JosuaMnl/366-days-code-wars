// Day 34/366
// https://www.codewars.com/kata/5526fc09a1bbd946250002dc

// My Answers
fun find(integers: Array<Int>) = integers.groupBy { it % 2 == 0 }.values.sortedBy { it.size }[0][0]

// Best Practices
// fun find(integers: Array<Int>) = integers.singleOrNull { it % 2 == 0 } ?: integers.single { it % 2 != 0 }

fun main() {
    println(find(arrayOf(2,6,8,-10,3)))
    println(find(arrayOf(206847684,1056521,7,17,1901,21104421,7,1,35521,1,7781)))
    println(find(arrayOf(Integer.MAX_VALUE, 0, 1)))    
}