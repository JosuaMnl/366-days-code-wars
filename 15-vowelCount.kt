// Day 15/366
// https://www.codewars.com/kata/54ff3102c1bad923760001f3

// My Answers
fun getCount(str : String) : Int {
    val vowel = listOf('a', 'i', 'u', 'e', 'o')
    var count = 0
    str.map { item ->
        vowel.map { vowelItem ->
            if (item == vowelItem) count++
        }
    }
    return count
}

// Best Practices
// fun getCount(str: String) = str.count { it in "aiueo"}

fun main() {
	println(getCount("abracadabra"))
    println(getCount("test"))
    println(getCount("example"))
}