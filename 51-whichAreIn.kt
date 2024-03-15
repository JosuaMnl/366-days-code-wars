// Day 51/366
// https://www.codewars.com/kata/550554fd08b86f84fe000a58

// My Answers
fun inArray(array1: Array<String>, array2: Array<String>): Array<String> {
    var result = mutableListOf<String>()
    array1.forEach { arr1 ->
        array2.forEach { arr2 ->
            if(arr2.contains(Regex("$arr1"))) result.add(arr1)
        }    
    }
    return result.toSortedSet().toTypedArray()
}

// Best Practices
// fun inArray(array1: Array<String>, array2: Array<String>): Array<String> {
//    return array1.filter{e->array2.any{it.contains(e)}}.distinct().sorted().toTypedArray()
// }

fun main() {
    println(inArray(arrayOf<String>("xyz", "live", "strong"), arrayOf<String>("lively", "alive", "harp", "sharp", "armstrong")))
    println(inArray(arrayOf<String>("live", "strong", "arp"), arrayOf<String>("lively", "alive", "harp", "sharp", "armstrong")))
    println(inArray(arrayOf<String>("tarp", "mice", "bull"), arrayOf<String>("lively", "alive", "harp", "sharp", "armstrong")))
}