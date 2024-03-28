// Day 65/366
// https://www.codewars.com/kata/5300901726d12b80e8000498

// My Answers
fun fizzBuzz(n: Int): Array<String> {
  var result = mutableListOf<String>()
  for (num in 1..n) {
    if (num % 3 == 0 && num % 5 == 0) {
      result.add("FizzBuzz")
    } else if(num % 3 == 0) {
      result.add("Fizz")
    } else if(num % 5 == 0) {
      result.add("Buzz")
    } else {
      result.add("$num")
    }
  }
  return result.toTypedArray()
}

// Best Practices
// fun fizzBuzz(n: Int) = (1..n).map { num ->
//   when {
//     num % 15 == 0 -> "FizzBuzz"
//     num % 3 == 0 -> "Fizz"
//     num % 5 == 0 -> "Buzz"
//     else -> "$num"
//   }
// }.toTypedArray()

fun main() {
    println(fizzBuzz(4))
    println(fizzBuzz(3))
    println(fizzBuzz(10))
}