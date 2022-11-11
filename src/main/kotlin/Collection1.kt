fun main(){
    // Les collection en Kotlin
    // Map: mapOf()

    val dico = mapOf("Math" to 85, "Java" to 88, "Python" to 98)
    var sum = 0

    for((key, value ) in dico.entries){
        println("$key\t => $value")
        sum += value
    }
    println("---------------")
    val average = sum / dico.size
    println("Your average is: $average / 100")

    println("Keys ${dico.keys}")
    println("Values ${dico.values}")
}
