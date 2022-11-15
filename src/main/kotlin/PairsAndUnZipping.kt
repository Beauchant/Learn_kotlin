fun main(){
    val pair1 = listOf("Math" to 78, "Java" to 88, "Python" to 98)

    // create a single pair
    val pair2 = "Math" to 90
    println(pair2)
    println(pair2.first)
    println(pair2::class.java.typeName)
    println("---------------------")

    // Unzipping pair1
    val unZipping = pair1.unzip()
    println("UnZipping pair2 -> $unZipping")
    println(pair1.unzip().second)
    println(unZipping::class.java.typeName)
    println(unZipping.first::class.java.typeName)
    println("---------------------")

    // print only numbers in pair1
    pair1.unzip().second.forEach{ println(it) }
    println("---------------------")

    // Separate pair1 into two variables
    val p1 = pair1.unzip().first
    val p2 = pair1.unzip().second
    println(p1)
    println(p2)
    println(p1::class.java.typeName)
//    println((p1 zip p2)::class.java.typeName)
}
