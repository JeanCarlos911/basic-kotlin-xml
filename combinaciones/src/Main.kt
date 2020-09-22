fun main() {
    pass(8, "")
}

fun pass(size: Int, string: String): String{
    val newSize = size - 1
    var l = 48.toChar()

    for(i in 0..61){
        var newString = "$string$l"
        if(newSize > 0) {
            newString = pass(newSize,"$string$l")
        } else {
            println(newString)
        }
        l = l.next()
    }
    return ""
}

//numbers in 48 .. 57, upper case in 65 .. 89, down case in 97 .. 122
fun Char.next(): Char {
    return when(this.toInt()) {
        in 48..56, in 65..89, in 97..121-> (this.toInt() + 1).toChar()
        57 -> 65.toChar()
        90 -> 97.toChar()
        else -> 48.toChar()
    }
}
