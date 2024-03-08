// Day 44/366
// https://www.codewars.com/kata/5aa736a455f906981800360d

// My Answers
fun feast(beast: String, dish: String): Boolean {
    var firstLetterBeast = beast.take(1)
    var lastLetterBeast = beast.takeLast(1)

    var firstLetterDish = dish.take(1)
    var lastLetterDish = dish.takeLast(1)

    if (firstLetterBeast == firstLetterDish && lastLetterBeast == lastLetterDish) {
        return true
    }
    return false
}

// Best Practices
// fun feast(beast: String, dish: String) = beast.first() == dish.first() && beast.last() == dish.last()

fun main() {
    println(feast("great blue heron", "garlic naan")) // true
    println(feast("chickadee", "chocolate cake")) // true
    println(feast("brown bear", "bear claw")) // false
    println(feast("marmot", "mulberry tart")) // true
    println(feast("porcupine", "pie")) // true
    println(feast("electric eel", "lasagna")) // false
}