// Day 29/366
// https://www.codewars.com/kata/56747fd5cb988479af000028

// My Answers
fun getMiddle(word : String) : String {
    if(word.length > 1) {
        if(word.length%2 ==0) {
            return word.substring(word.length/2-1, word.length/2+1)
        } else {
            return word.substring(word.length/2, word.length/2+1)
        }
    } else {
        return word
    }
}

// Best Practices
// fun getMiddle(word : String) = word.substring (word.length / 2 - (word.length + 1) % 2, word.length / 2 + 1)

fun main() {
    println(getMiddle("test"));
    println(getMiddle("middle"));
    println(getMiddle("testing"));
    println(getMiddle("A"));
}