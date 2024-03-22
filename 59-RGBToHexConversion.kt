// Day 59/366
// https://www.codewars.com/kata/513e08acc600c94f01000001

// My Answers
fun rgb(r: Int, g: Int, b: Int): String {    
    var newR = if (r < 0) 0 else if(r > 255) 255 else r
    var newG = if (g < 0) 0 else if(g > 255) 255 else g
    var newB = if (b < 0) 0 else if(b > 255) 255 else b    
    val result = convertDecToHexa(newR) + convertDecToHexa(newG) + convertDecToHexa(newB)
    return result
}

fun convertDecToHexa(dec: Int): String {
    var quotient = dec    
    var result = ""
    if (dec <= 15) {
        result += "0"+ decimalToHexadecimal[dec]
    } else {
        while (quotient != 0) {            
            val remainder = quotient % 16
            result += decimalToHexadecimal[remainder]
            quotient = quotient / 16
        }
        result = result.reversed()        
    }
    return result
}

val decimalToHexadecimal = mapOf(
    0 to "0",
    1 to "1",
    2 to "2",
    3 to "3",
    4 to "4",
    5 to "5",
    6 to "6",
    7 to "7",
    8 to "8",
    9 to "9",
    10 to "A",
    11 to "B",
    12 to "C",
    13 to "D",
    14 to "E",
    15 to "F"
)

// Best Practices
// fun rgb(r: Int, g: Int, b: Int) = listOf(r, g, b).joinToString("") { "%02X".format(it.coerceIn(0, 255)) }

fun main() {
    println(rgb(0, 0, 0)) // "000000"
    println(rgb(0, 0, -20)) // "000000"
    println(rgb(300,255,255)) // "FFFFFF"
    println(rgb(173,255,47)) // "ADFF2F"
    println(rgb(148, 0, 211)) // "9400D3"
    println(rgb(11, 11, 11)) // "0B0B0B"
}