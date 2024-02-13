// Day 2/366
// https://www.codewars.com/kata/5a00e05cc374cb34d100000d

// My Answers
fun reverseSeq(n: Int): List<Int> {
  val seq = n.downTo(1)
  return seq.toList()
}

// Best Practices
// fun reverseSeq(n: Int) = (n downTo 1).toList()

fun main() {
  println(reverseSeq(5))
}
