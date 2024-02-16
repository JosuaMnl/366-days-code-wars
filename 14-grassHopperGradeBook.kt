// Day 14/366
// https://www.codewars.com/kata/55cbd4ba903825f7970000f5

// My Answers
fun getGrade (s1: Int, s2: Int, s3: Int): Char {
    val scoreAverage = (s1+s2+s3) / 3
    var grade = if (90 <= scoreAverage && scoreAverage <= 100) 'A' 
    else if (80 <= scoreAverage && scoreAverage < 90) 'B'
    else if (70 <= scoreAverage && scoreAverage < 80) 'C'
    else if (60 <= scoreAverage && scoreAverage < 70) 'D'    
    else 'F'

    return grade
}

// Best Practices
// fun getGrade (vararg s: Int): Char {
//     val score = s.fold(0) { curr, item -> curr + item} / s.size
//     var grade = if (score < 60) 'F' 
//     else if (score < 70) 'D'
//     else if (score < 80) 'C'
//     else if (score < 90) 'B'
//     else 'A'
//     return grade
// }

fun main() {
    println(getGrade(95,90,93))
    println(getGrade(100,85,96))
    println(getGrade(92,93,94))
}