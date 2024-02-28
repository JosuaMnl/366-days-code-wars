// Day 35/366
// https://www.codewars.com/kata/5656b6906de340bd1b0000ac

// My Answers
fun longest(s1:String, s2:String) = (s1+s2).toSet().sorted().joinToString("")

// Best Practices
// fun longest(s1:String, s2:String) = (s1+s2).toSortedSet().joinToString("")
// fun longest(s1:String, s2:String) = "abcdefghijklmnopqrstuvwxyz".filter { it in s1 || it in s2 }

fun main() {
    println(longest("aretheyhere", "yestheyarehere"))
}