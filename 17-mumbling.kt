// Day 17/366
// https://www.codewars.com/kata/5667e8f4e3f572a8f2000039

// My Answers
fun accum(s:String):String {
    var result = ""

    for (i in 0..s.length-1) {
        var char = s[i]
        if (i == 0) {
            result += char.uppercaseChar()
        } 
        else {
            result += '-'
            var nextChar = char.uppercaseChar() + char.lowercaseChar().toString().repeat(i)
            result += nextChar
        } 
    }
    
    return result
}

// Best Practices
// fun accum(s:String):String = s.mapIndexed { index, char -> char.uppercase() + char.toString().lowercase().repeat(index) }.joinToString("-")


fun main() {
    println(accum("abcd"))
    println(accum("RqaEzty"))
    println(accum("cwAt"))
    println(accum("EquhxOswchE")) // E-Qq-Uuu-Hhhh-Xxxxx-Oooooo-Sssssss-Wwwwwwww-Ccccccccc-Hhhhhhhhhh-Eeeeeeeeeee 
}