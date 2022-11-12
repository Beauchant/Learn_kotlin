fun main(){
    val car1 = Car()
    car1.name = "Range Rover"
    car1.model = "X7M"
    car1.color = "Black and white"
    car1.doors = 4

    val car2 = Car()
    car2.name = "BMW"
    car2.model = "X6"
    car2.color = "Dark-blue"
    car2.doors = 4

    println(car1)
    println(car2)

    println("----------------------------------")

    car1.display()
    car1.move()
    car1.stop()

    println("----------------------------------")

    car2.display()
    car2.move()
    car2.stop()
}

// Basic OOP in Kotlin
class Car{
    var name = ""
    var model = ""
    var color = ""
    var doors = 0

    override fun toString(): String {
        return "$name $doors doors $color color"
    }

    fun display(){
        println("$name $doors doors $color color")
    }

    fun move(){
        println("The car $name is moving!")
    }

    fun stop(){
        println("The car $name has stopped!")
    }
}
