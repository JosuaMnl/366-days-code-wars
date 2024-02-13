// Day 3/366
// https://www.codewars.com/kata/59ca8246d751df55cc00014c

// My Answers
fun hero(bullets: Int, dragons: Int) : Boolean {
    val isSurvived = if (bullets / 2 >= dragons) true else false
    return isSurvived
}

// Best Practices
// fun hero(bullets: Int, dragons: Int) = bullets >= dragons * 2

fun main() {
    println(hero(10, 5))
    println(hero(7, 4))
    println(hero(4, 5))
    println(hero(100, 40))
    println(hero(1500, 751))
    println(hero(0, 1))
}