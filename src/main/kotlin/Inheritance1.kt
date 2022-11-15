fun main(){
    val moto1 = Motorcycle("Yamaha", "Red", 2)
    moto1.move()
    moto1.stop()
}

// Use inheritance in kotlin
open class Vehicle(val name: String, val color: String){
    fun move(){
        println("$name is moving!")
    }

    fun stop(){
        println("$name has stopped!")
    }
}

class Motorcycle(name: String, color: String, val wheels: Int): Vehicle(name, color)

class Plane(name: String, color: String, val doors: Int): Vehicle(name, color)
