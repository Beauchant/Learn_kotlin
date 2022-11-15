fun main(){
    val numbers = setOf(1, 2, 3, 4, 5)
    println(numbers.map { it })
    println("------------------")

    println(numbers.map { it * 10})
    println("------------------")

    println(numbers.map { if(it % 2 == 0) it * 100 else it * 10})
    println("------------------")

    val myMap = mapOf("key 1" to 1, "key 2" to 2, "key 3" to 3, "key 4" to 4)
    println(myMap.mapKeys { it.key.uppercase() })
//    println(myMap.mapKeys { it.value + it.key.length })
    println("------------------")
    myMap.forEach { (t, u) -> println("$t -> $u") }
    println("------------------")

    myMap.forEach { (t, u) -> if(u % 2 == 0) println("$t -> $u") }
//    myMap.forEach { (t, u) -> if(u % 2 == 0) println("$t -> $u") else println(0) }
    println("------------------")

    val myList = listOf("Bob", "Haaland", "Boby", "Firmino")
    for((index, value) in myList.withIndex()){
        println("$index -> $value")
    }

    println(myMap::class.java.typeName)
}
