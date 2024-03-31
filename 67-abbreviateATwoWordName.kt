// Day 67/366
// https://www.codewars.com/kata/57eadb7ecd143f4c9c0000a3

// My Answers
fun abbrevName(name:String) = name.split(" ").map { it[0].uppercase() }.joinToString(".")

// Best Practices
// fun abbrevName(name:String) = name.split(" ").joinToString(".") { str -> str.take(1).uppercase() }

fun main() {
    println(abbrevName("Sam Harris")); // "S.H"
    println(abbrevName("Patrick Feenan")); // "P.F"
    println(abbrevName("Evan Cole")); // "E.C"
    println(abbrevName("P Favuzzi")); // "P.F"
    println(abbrevName("David Mendieta")); // "D.M"
}