// Day 25/366
// https://www.codewars.com/kata/5ab6538b379d20ad880000ab

// My Answers
object Solution {
    fun areaOrPerimeter(l:Int, w:Int) = if(l==w) l*w else 2*(l+w)
}

fun main() {
    println(Solution.areaOrPerimeter(2, 2))
    println(Solution.areaOrPerimeter(3, 2))
}