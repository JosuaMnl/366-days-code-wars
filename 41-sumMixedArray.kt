// Day 41/366
// https://www.codewars.com/kata/57eaeb9578748ff92a000009

// My Answers
public class MixedSum {

    /*
    * Assume input will be only of Int or String type
    */
    public fun sum(mixed: List<Any>): Int {
        var newArr = mixed.map { it.toString().toInt() }
        return newArr.sum();
    }
}

// Best Practices
// public class MixedSum {
//     public fun sum(mixed: List<Any>) = mixed.sumOf { it.toString().toInt() }
// }

fun main(){
    val mixedSum = MixedSum();
    println(mixedSum.sum(listOf("3", 6, 6, 0, "5", 8, 5, "6", 2, "0"))); // 41
}