// Day 13/366
// https://www.codewars.com/kata/5bb904724c47249b10000131

// My Answers
fun points(games: List<String>): Int {
    var total = 0
    games.forEach { item ->        
        if (item[0] == item[2]) {
            total += 1
        } else if (item[0] > item[2]) {
            total += 3
        } 
    }
    return total
}

// Best Practices
// fun points(games: List<String>) = games.fold(0) { curr, item -> if (item[0] == item[2]) curr + 1 else if (item[0] > item[2]) curr + 3 else curr }


fun main() {
    println(points(listOf("1:0", "2:0", "3:0", "4:0", "2:1", "3:1", "4:1", "3:2", "4:2", "4:3")));
    println(points(listOf("1:1", "2:2", "3:3", "4:4", "2:2", "3:3", "4:4", "3:3", "4:4", "4:4")));
    println(points(listOf("0:1", "0:2", "0:3", "0:4", "1:2", "1:3", "1:4", "2:3", "2:4", "3:4")));
    println(points(listOf("1:0", "2:0", "3:0", "4:0", "2:1", "1:3", "1:4", "2:3", "2:4", "3:4")));
    println(points(listOf("1:0", "2:0", "3:0", "4:4", "2:2", "3:3", "1:4", "2:3", "2:4", "3:4")));
}