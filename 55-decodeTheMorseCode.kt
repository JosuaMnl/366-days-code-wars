// Day 55/366
// https://www.codewars.com/kata/54b724efac3d5402db00065e

// My Answers
fun decodeMorse(code: String) : String {    
    val lstCode = code.split("   ").map { it.split(" ") }
    var sentence = ""
    for (i in 0 until lstCode.size) { 
        val word = lstCode[i].fold("") { curr, acc -> curr + MorseCode.getOrDefault(acc, "") }
        sentence += word
        sentence += " "
    }
    return sentence.trim()
}

// Best Practices
// fun decodeMorse(code: String) = code.split(" ").map { x -> MorseCode[x] ?: " " }.joinToString("").replace("  ", " ").trim()

val MorseCode = mapOf(
    ".-" to "A",
    "-..." to "B",
    "-.-." to "C",
    "-.." to "D",
    "." to "E",
    "..-." to "F",
    "--." to "G",
    "...." to "H",
    ".." to "I",
    ".---" to "J",
    "-.-" to "K",
    ".-.." to "L",
    "--" to "M",
    "-." to "N",
    "---" to "O",
    ".--." to "P",
    "--.-" to "Q",
    ".-." to "R",
    "..." to "S",
    "-" to "T",
    "..-" to "U",
    "...-" to "V",
    ".--" to "W",
    "-..-" to "X",
    "-.--" to "Y",
    "--.." to "Z",
    ".----" to "1",
    "..---" to "2",
    "...--" to "3",
    "....-" to "4",
    "....." to "5",
    "-...." to "6",
    "--..." to "7",
    "---.." to "8",
    "----." to "9",
    "-----" to "0",
    "...---..." to "SOS",
    "-.-.--" to "!",
    ".-.-.-" to "."
)

fun main() {
    println(decodeMorse(".... . -.--   .--- ..- -.. .")) // HEY JUDE
    println(decodeMorse(" . ")) // E
    println(decodeMorse(" ...---... -.-.-- - .... . --.- ..- .. -.-. -.- -... .-. --- .-- -. ..-. --- -..- .--- ..- -- .--. ... --- ...- . .-. - .... . .-.. .- --.. -.-- -.. --- --. .-.-.-")) // SOS!THEQUICKBROWNFOXJUMPSOVERTHELAZYDOG.    
}