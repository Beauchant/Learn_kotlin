fun main() {
    // Kotlin's primitive data types

    // Byte
    println("Byte maximum value is: ${Byte.MAX_VALUE}")
    println("Byte minimum value is: ${Byte.MIN_VALUE}")
    println("------------------------")

    // Short
    println("Short maximum value is: ${Short.MAX_VALUE}")
    println("Short minimum value is: ${Short.MIN_VALUE}")
    println("------------------------")

    // Int
    println("Int maximum value is: ${Int.MAX_VALUE}")
    println("Int minimum value is: ${Int.MIN_VALUE}")
    println("------------------------")

    // Float
    println("Float maximum value is: ${Float.MAX_VALUE}")
    println("Float minimum value is: ${Float.MIN_VALUE}")
    println("------------------------")

    // Double
    println("Double maximum value is: ${Double.MAX_VALUE}")
    println("Double minimum value is: ${Double.MIN_VALUE}")
    println("------------------------")

    // Long
    println("Long maximum value is: ${Long.MAX_VALUE}")
    println("Long minimum value is: ${Long.MIN_VALUE}")
    println("------------------------")

    // Char
    var myChar: Char = 'D'

    // Boolean
    var estVrai = true
    var estFaux = false

    // Verify the type of variable
    var lval: Float = 234.6f
    println(lval::class.java.typeName)
}
