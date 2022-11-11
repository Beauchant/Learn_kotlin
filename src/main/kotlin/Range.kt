fun main(){
   val nb = 7

    if(nb in 1..10){
        println("The number is in 1 à 10")
    }

    var somme = 0
    var accumulator = 1

    while (accumulator in 0..10){
        somme += accumulator
        accumulator += 1
    }

    println("The somme is $somme")

    for(i in 0..10){
        println("Position $i")
    }

    // Another way
    val oneToFive = 1.rangeTo(5)
    val sixToThree = 6.downTo(3)

    5.downTo(1).forEach { println(it) }
    println("----------------")
    oneToFive.forEach { println(it) }
    println("----------------")
//
//    for(i in 1.rangeTo(5)){
//        println(i)
//    }
//    println("---------")
//    for(i in 5.downTo(1)){
//        println(i)
//    }
}

