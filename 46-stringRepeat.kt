// Day 46/366
// https://www.codewars.com/kata/57a0e5c372292dd76d000d7e

// My Answers
fun repeatStr(r: Int, str: String) = str.repeat(r)

fun main() {
    println(repeatStr(4, "a")) // aaaa
    println(repeatStr(3, "Hello")) // HelloHelloHello
    println(repeatStr(5, "")) // ""
    println(repeatStr(0, "kata")) // ""
}