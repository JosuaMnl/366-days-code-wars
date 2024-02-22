// Day 27/366
// https://www.codewars.com/kata/52fba66badcd10859f00097e

// My Answers
fun disemvowel(str: String): String {
    var newStr = ""
    str.forEach { 
        if (it.lowercaseChar() !in "aiueo") newStr += it        
    }
    return newStr
}

// Best Practices
// fun disemvowel(str: String) = str.filter { it.lowercaseChar() !in "aiueo" }
// fun disemvowel(str: String) = str.replace(Regex("[AaIiUuEeOo]"), "")

fun main() {
    println(disemvowel("This website is for losers LOL!"))
    println(disemvowel("No offense but,\nYour writing is among the worst I've ever read"))
    println(disemvowel("What are you, a communist?"))
}