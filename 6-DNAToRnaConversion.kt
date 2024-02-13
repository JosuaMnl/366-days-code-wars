// Day 6/366
// https://www.codewars.com/kata/5556282156230d0e5e000089

// My Answers
fun DNAtoRNA(dna: String): String {
    var rna = ""
    for (molecule in dna) {
        if (molecule == 'T') {
            rna += "U"
        } else {
            rna += molecule
        }
    }
    return rna;
}

// Best Practices
// fun DNAtoRNA(dna: String) = dna.replace("T", "U");

fun main() {
    println(DNAtoRNA("GCAT"))    
    println(DNAtoRNA("TTTT"))    
}