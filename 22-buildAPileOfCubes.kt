// Day 22/366
// https://www.codewars.com/kata/5592e3bd57b64d00f3000047

// My Answers
object ASum {
    fun findNb(m: Long): Long {
        var result = 0L
        var n = 1L
        while(m > result) {
            result += n*n*n
            n++
        }        
        return if(result == m) n - 1 else -1;
    }
}

// Best Practices
// object ASum {
//     fun findNb(m: Long): Long {
//         var sum = 0L
//         return generateSequence(1L) { it + 1 }.onEach { sum += it*it*it }
//             .takeWhile { m >= sum }
//             .lastOrNull { sum == m } ?: -1
//     }
// }

fun main() {
    println(ASum.findNb(225)) //5
    println(ASum.findNb(56396345062501)) //-1
    println(ASum.findNb(6132680780625)) //2225
    println(ASum.findNb(28080884739601)) //-1
}