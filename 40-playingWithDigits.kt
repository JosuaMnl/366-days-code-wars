// Day 40/366
// https://www.codewars.com/kata/5552101f47fc5178b1000050

// My Answers
fun digPow(n: Int, p: Int): Int {
    var lstNum = n.toString().map { it - '0'}
    var result = 0
    lstNum.forEachIndexed { index, num ->
        var temp = 1
        for (i in 1..index+p) {            
            temp *= num
        }
        result += temp
    }
    var k = result % n
    return if(k == 0) result / n else -1
}

// Best Practices
// import kotlin.math.pow
// fun digPow(n: Int, p: Int) = n.toString().mapIndexed { i, item -> (item - '0').toDouble().pow(i+p).toInt() }.sum().let { if(it % n == 0) it/n else -1 } 

fun main() {
    println(digPow(89, 1)) // 1
    println(digPow(92, 1)) // -1
    println(digPow(46288, 3)) // 51
}