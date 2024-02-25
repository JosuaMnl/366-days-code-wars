// Day 32/366
// https://www.codewars.com/kata/5848565e273af816fb000449

// My Answers
fun encryptThis(text:String): String{
    var words = text.split(" ")
    var newSentence = mutableListOf<String>()
    for (i in 0..words.size - 1) {
        var x = words[i]
        var newWord = ""
        for (j in 0..x.length - 1) {
            if (j == 0) {
                newWord += x[0].code
            } else if (j == 1) {
                newWord += x[x.length - 1]
            } else if(j == x.length - 1) {
                newWord += x[1]
            } else {
                newWord += x[j]
            }
        }
        newSentence.add(newWord)
    }
    
    return newSentence.joinToString(" ")
}

// Best Practices
// fun encryptThis(text:String) = text.split(" ").joinToString(" ") { it.first().code.toString() + it.drop(2).takeLast(1) + it.drop(2).dropLast(1) + it.drop(1).take(1) }

fun main() {
    println(encryptThis("A wise old owl lived in an oak")) // 65 119esi 111dl 111lw 108dvei 105n 97n 111ka
    println(encryptThis("hello world")) // 104olle 119drlo
}