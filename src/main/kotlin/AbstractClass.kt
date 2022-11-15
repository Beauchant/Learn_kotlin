fun main(){
    val d1 = Dog("Black", "Black", 3)
    d1.move()
    d1.sleep()
    println("----------------")

    d1.display()
    println(Animal.countObject)
    println(Animal.countObject)
}

abstract class Animal{
    companion object{
        var countObject = 0
    }

    init {
        countObject += 1
    }

    fun display(){
        println("It works!")
    }
    abstract fun move()
    abstract fun sleep()
}

class Dog(var name: String, var color: String, var age: Int): Animal(){

    override fun move() {
        println("$name is moving!")
    }

    override fun sleep() {
        println("$name is sleeping!")
    }
}
