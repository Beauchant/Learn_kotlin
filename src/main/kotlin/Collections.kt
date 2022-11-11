fun main(){
    // Les collection en Kotlin
    // -----Immutable collections-----
    // List => listOf(), listOf<T>()
    // Array => arrayOf, arrayOf<T<()
    // Set: setOf()

    val collect = arrayOf("Bob", 45, "Venise", 4.5, true, true, '@')
    for(item in collect){
        when (item) {
            is Int -> {
                println("This is an Int item (${item})")
            }

            is String -> {
                println("This is a String item (${item})")
            }

            is Boolean -> {
                println("This is a Boolean item (${item})")
            }

            is Double -> {
                println("This is a Double item (${item})")
            }

            is Char -> {
                println("This is a Char item (${item})")
            }
        }
    }
}
