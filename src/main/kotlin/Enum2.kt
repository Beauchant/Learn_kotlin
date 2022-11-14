fun main(){
    for(direction in Direction.values()){
        println(direction)
    }
    println("---------------------")

    for(direction in Direction.values()){
        println("$direction: => ${direction.direction} => ${direction.distance}")
    }
    println("---------------------")

    for(direction in Direction.values())(
            direction.displayData()
    )
    println("---------------------")

    // Generate random numbers
    val rnd = (0 until Direction.values().size).random()
    when(val direction = Direction.values()[rnd]){
        Direction.NORD -> println("Direction $direction ")
        Direction.SUD -> println("Direction $direction ")
        Direction.EST -> println("Direction $direction ")
        Direction.OUEST -> println("Direction $direction ")
    }
}

// enum with constructor
enum class Direction(var direction: String, var distance: Int){
    NORD("Nord", 10),
    SUD("Sud", 20),
    EST("Est", 30),
    OUEST("Ouest", 40);

    fun displayData(){
        println("Direction => $direction and distance => $distance km")
    }
}
