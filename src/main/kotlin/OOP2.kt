fun main(){
    val myCar1 = MyCar("Range Rover", "X7M", "Black and white", 4)
    val myCar2 = MyCar("BMW", "X6", "Dark-blue", 4)

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
}

// Basic OOP in Kotlin
class MyCar(name: String, model: String, color: String, doors: Int){
    var name = name
    var model = model
    var color = color
    var doors = doors

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
