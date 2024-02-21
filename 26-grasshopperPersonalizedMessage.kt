// Day 26/366
// https://www.codewars.com/kata/5772da22b89313a4d50012f7

// My Answers
fun greet(name: String, owner: String) = if (owner == name) "Hello boss" else "Hello guest"

fun main() {
    println(greet("Daniel", "Daniel"))
    println(greet("Greg", "Daniel"))
}