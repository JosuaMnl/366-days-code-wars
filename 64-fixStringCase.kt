// Day 64/366
// https://www.codewars.com/kata/5b180e9fedaa564a7000009a

// My Answers
object FixStringCase {
    fun solve(s: String) : String {
        var result: String
        val lower = s.count { it.isLowerCase() }
        val upper = s.count { it.isUpperCase() }
        if (lower == upper || lower > upper) {
            result = s.lowercase()
        } else {
            result = s.uppercase()
        }
        return result
    }
}

// Best Practices
// object FixStringCase {
//     fun solve(s: String): String = if (s.count { it.isLowerCase() } >= s.length/2.0) s.lowercase() else s.uppercase()
// }

fun main() {
    println(FixStringCase.solve("code")) // code
    println(FixStringCase.solve("CODe")) // CODE
    println(FixStringCase.solve("COde")) // code
    println(FixStringCase.solve("Code")) // code
    println(FixStringCase.solve("")) // ""
}