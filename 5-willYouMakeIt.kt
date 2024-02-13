// Day 5/366
// https://www.codewars.com/kata/5861d28f124b35723e00005e

// My Answers
fun zeroFuel(distanceToPump: Int, mpg: Int, fuelLeft: Int): Boolean {
    return distanceToPump <= mpg * fuelLeft;
}

// Best Practices
// fun zeroFuel(distanceToPump: Int, mpg: Int, fuelLeft: Int) = distanceToPump <= mpg * fuelLeft;

fun main() {
    println(zeroFuel(100, 50, 2))
    println(zeroFuel(100, 50, 1))
}