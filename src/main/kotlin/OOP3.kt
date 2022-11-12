fun main(){
    val myCar1 = CarClass("Range Rover", "R7", "Red", 4)
    val myCar2 = CarClass("BMW", "X5", "Blue", 4)

//    println(myCar1)
//    println(myCar2)

    println("----------------------------------")

    myCar1.display()
    myCar1.move()
    myCar1.stop()

    println("----------------------------------")

    myCar2.display()
    myCar2.move()
    myCar2.stop()

    println("Name: ${myCar2.name} O")
}

// Basic OOP in Kotlin
class CarClass(name: String, var model: String, var color: String, var doors: Int = 0){
    var name: String = name.uppercase()

    // Secondary constructor
    constructor(name: String, color: String, doors: Int): this(name, "Missing", color, doors)

    override fun toString(): String {
        return "$name $model $doors doors $color color"
    }

    fun display(){
        println("$name $model $doors doors $color color")
    }

    fun move(){
        println("The car $name is moving!")
    }

    fun stop(){
        println("The car $name has stopped!")
    }
}
