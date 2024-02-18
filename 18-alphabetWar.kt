// Day 18/366
// https://www.codewars.com/kata/59377c53e66267c8f6000027

// My Answers
fun alphabetWar(fight: String): String {
    var rightScore = 0
    var leftScore = 0
    val lefttSide = mapOf(
        'w' to 4,
        'p' to 3,
        'b' to 2,
        's' to 1,    
    )
    val rightSide = mapOf(
        'm' to 4,
        'q' to 3,
        'd' to 2,
        'z' to 1
    )

    fight.forEach { 
        val str = it.lowercaseChar()
        if (str in rightSide.keys) rightScore += rightSide.getValue(str)
        if (str in lefttSide.keys) leftScore += lefttSide.getValue(str)        
    }

    var result = if (leftScore < rightScore) "Right side wins!" else if (leftScore > rightScore) "Left side wins!" else "Let's fight again!"
    return result
}

// Best Practices
// fun alphabetWar(fight: String): String {
//     val rulesOfWar = mapOf('w' to 4, 'p' to 3, 'b' to 2, 's' to 1, 'm' to -4, 'q' to -3, 'd' to -2, 'z' to -1)
//     var score = fight.sumOf { rulesOfWar.getOrDefault(it, 0) }
//     return if (score < 0) "Right side wins!" else if (score > 0) "Left side wins!" else "Let's fight again!"
// }

fun main() {
    println(alphabetWar("z"))
    println(alphabetWar("zdqmwpbs"))
    println(alphabetWar("zzzzs"))
    println(alphabetWar("wwwwww"))
}