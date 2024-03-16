// Day 52/366
// https://www.codewars.com/kata/5b853229cfde412a470000d0

// My Answers
fun twiceAsOld(dadYearsOld: Int, sonYearsOld: Int): Int {
    val twice = sonYearsOld * 2
    var result = dadYearsOld - twice
    if (twice > dadYearsOld) {
        result = twice - dadYearsOld
    }
    return result
}

// Best Practices
// fun twiceAsOld(dadYearsOld: Int, sonYearsOld: Int) = Math.abs(dadYearsOld - (sonYearsOld * 2))

fun main() {
    println(twiceAsOld(36,7))
    println(twiceAsOld(55,30))
    println(twiceAsOld(42,21))
    println(twiceAsOld(22,1))
    println(twiceAsOld(29,0))
}