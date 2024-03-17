// Day 54/366
// https://www.codewars.com/kata/550498447451fbbd7600041c

// My Answers
fun comp(a: IntArray?, b: IntArray?) : Boolean {    
    val newA = a?.map {it*it}    
    return newA?.sorted() == b?.sorted() ?: false
}

// Best Practices
// fun comp(a: IntArray?, b: IntArray?) = a != null && b != null && a.map { it * it }.sorted() == b.sorted()

fun main() {
    val a1 = intArrayOf(121, 144, 19, 161, 19, 144, 19, 11)
    val a2 = intArrayOf(11*11, 121*121, 144*144, 19*19, 161*161, 19*19, 144*144, 19*19)
    println(comp(a1, a2))
}