// Day 37/366
// https://www.codewars.com/kata/55bf01e5a717a0d57e0000ec

// My Answers
fun persistence(num: Int) : Int {
    var result = 0
    var temp = num
    
    while (temp.toString().length != 1){        
        var numList = temp.toString().map { it - '0' }                
        temp = numList.fold(1) { curr, item -> curr * item }
        result++
    }
    return result
}

// Best Practices
// fun persistence(num: Int) = generateSequence(num) { it.toString().map(Character::getNumericValue).reduce(Int::times) }.takeWhile { it > 9 }.count()
// fun persistence(num: Int): Int = if (num < 10) 0 else 1 + persistence(num.toString().map { it - '0' }.reduce(Int::times))

fun main(){
    println(persistence(39)) // 3
    println(persistence(4)) // 0
    println(persistence(25)) // 2
    println(persistence(999)) // 4
}