fun main(){
    val names = listOf("Boby", "Bryant", "Martha", "Virginie")
    val myMap = names.associateWith { it.length }

    println(myMap)
    println(names.associateBy { it.first().uppercase() })
    println(myMap::class.java.typeName)
    println("-------------------")

    println(names.associateBy(keySelector = {it.first().uppercase()}, valueTransform = {it.length}))
}
