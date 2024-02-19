// Day 20/366
// https://www.codewars.com/kata/563b662a59afc2b5120000c6

// My Answers
fun nbYear(pp0:Int, percent:Double, aug:Int, p:Int):Int {
    var year = 0
    var p0 = pp0
    while (p0< p) {        
        p0 = p0 + (p0 * percent/100).toInt() + aug
        year++
    }
    return year
}

// Best Practices
// fun nbYear(pp0:Int, percent:Double, aug:Int, p:Int) = generateSequence(pp0.toDouble()) { it + (it * percent/100) + aug }.takeWhile { it < p }.count()

fun main() {
    println(nbYear(1500, 5.0, 100, 5000))
    println(nbYear(1500000, 2.5, 10000, 2000000))
}