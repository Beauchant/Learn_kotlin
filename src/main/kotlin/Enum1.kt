fun main(){
    // Get the values of enum
    println(Saison.PRINTEMPS)
    println(Saison.ETE)
    println(Saison.AUTOMNE)
    println(Saison.HIVER)
    println("-------------------")

    for (i in 0 until Saison.values().size){
        println(Saison.values()[i])
    }
    println("-------------------")

    for (i in 0 until Saison.values().size){
        println("$i => ${Saison.values()[i]}")
    }
    println("-------------------")
    for(saison in Saison.values()){
        println(saison)
    }
    println("-------------------")

    // Get the size of enum
    println("Size of Saison: ${Saison.values().size}")
    println("-------------------")

    // Get index of the values in enum
    println(Saison.PRINTEMPS.ordinal)
    println(Saison.ETE.ordinal)
    println(Saison.AUTOMNE.ordinal)
    println(Saison.HIVER.ordinal)
}

// enum in kotlin
enum class Saison{
    PRINTEMPS,
    ETE,
    AUTOMNE,
    HIVER
}
