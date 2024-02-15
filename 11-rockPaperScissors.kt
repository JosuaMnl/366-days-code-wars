// Day 11/366
// https://www.codewars.com/kata/5672a98bdbdd995fad00000f

// My Answers
fun rps(p1: String, p2: String): String {
    val rpsValue = mapOf(
        0 to "rock",
        1 to "scissors",
        2 to "paper"
    )
    var result = ""
    if (p1 == p2) {
        result = "Draw!"
    } else if (p1 == rpsValue[0] && p2 == rpsValue[1] ||
                p1 == rpsValue[1] && p2 == rpsValue[2] ||
                p1 == rpsValue[2] && p2 == rpsValue[0]
    ) {
        result = "Player 1 won!"
    } else {
        result = "Player 2 won!"
    }
    return result
}

// Best Practices
// fun rps(p1: String, p2: String): String {
//     val rpsRules = mapOf(
//         "paper" to "rock",
//         "scissors" to "paper",
//         "rock" to "scissors"
//     )

//     if (p1 == p2) {
//         return "Draw!"
//     } else {
//         if (rpsRules[p1] == p2) {
//             return "Player 1 won!"
//         } else {
//             return "Player 2 won!"
//         }
//     }
// }

fun main() {
    // Player 1 won!
    println(rps("rock", "scissors"));
    println(rps("scissors", "paper"));
    println(rps("paper", "rock"));

    // Player 2 won!
    println(rps("scissors", "rock"));
    println(rps("paper", "scissors"));
    println(rps("rock", "paper"));

    // Draw!
    println(rps("rock", "rock"));
}