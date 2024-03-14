// Day 50/366
// https://www.codewars.com/kata/517abf86da9663f1d2000003

// My Answers
fun toCamelCase(str:String):String {
    val splitStr = str.split(Regex("[_-]"))
    val nextStr =  splitStr.drop(1).joinToString("") { it.replaceFirstChar { it.uppercaseChar() } }
    return splitStr.first() + nextStr
}

// Best Practices
// fun toCamelCase(str:String) = 
//     str.split(Regex("[_-]")).mapIndexed { index, char -> 
//         if(index != 0) char.replaceFirstChar { it.uppercaseChar() } else char }.joinToString("")
// fun toCamelCase(str:String) = str.split(Regex("[-_|]")).run { 
//     drop(1).joinToString("", first()) { it.replaceFirstChar { it.uppercaseChar() } }
// }

fun main(){
    println(toCamelCase("")) // ""
    println(toCamelCase("the_stealth_warrior")) // "theStealthWarrior"
    println(toCamelCase("The-Stealth-Warrior")) // "TheStealthWarrior"
    println(toCamelCase("A-B-C")) // "ABC"
}