// Day 48/366
// https://www.codewars.com/kata/526c7363236867513f0005ca

// My Answers
fun isLeapYear(year: Int) = year % 4 == 0 && year%100 != 0 || year%400 == 0

// Best Practices
// fun isLeapYear(year: Int) = java.time.Year.of(year).isLeap

fun main() {
    println(isLeapYear(2020))
    println(isLeapYear(2000))
    println(isLeapYear(2015))
    println(isLeapYear(2100))
    println(isLeapYear(2024))
}