// Day 60/366
// https://www.codewars.com/kata/52c31f8e6605bcc646000082

// My Answers
object TwoSum {
	fun twoSum(numbers: IntArray, target: Int): Pair<Int,Int> {
		val map = mutableMapOf<Int, Int>()		
        numbers.forEachIndexed { index, item ->
			val compliment = target - item
			if (map.containsKey(compliment)) {
				return Pair(map[compliment]!!, index)
			}
			map[item] = index
		}
		return Pair(-1, -1)
	}
}

// Best Practices
// object TwoSum {
// 	fun twoSum(numbers: IntArray, target: Int): Pair<Int,Int> {
// 		var x = 0
// 		var y = 0
// 		numbers.forEachIndexed { index, item ->
// 			val compliment = target - item
// 			if (numbers.contains(compliment)) {
// 				x = index
// 				y = numbers.indexOf(compliment)								
// 			}
// 		}
// 		return Pair(x, y)
// 	}
// }

fun main() {
    println(TwoSum.twoSum(intArrayOf(1, 2, 3), 4)) // (0, 2)
    println(TwoSum.twoSum(intArrayOf(2, 2, 3), 4)) // (0, 1)
}