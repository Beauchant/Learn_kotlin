fun main(){
    val numbersStrings = listOf("One", "Two", "Three", "Four", "Five")
    println(numbersStrings.joinToString(" "))
    println(numbersStrings.joinToString())

    // String buffer
    val listString = StringBuffer("The list of numbers: ")
    println(numbersStrings.joinTo(listString))
}
