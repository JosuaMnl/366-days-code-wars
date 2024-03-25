// Day 62/366
// https://www.codewars.com/kata/554e4a2f232cdd87d9000038

// My Answers
fun makeComplement(dna : String) : String {
    val complementaryDna = mapOf(
        'A' to 'T',
        'T' to 'A',
        'C' to 'G',
        'G' to 'C'
    )
    return dna.map { complementaryDna[it] }.joinToString("")
}

fun main() {
    println(makeComplement("AAAA")); // "TTTT"
    println(makeComplement("ATTGC")); // "TAACG"
}