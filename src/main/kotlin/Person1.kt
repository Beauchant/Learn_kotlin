class Person1(name: String, age: Int){
    var name: String
    var age: Int

    init {
        this.name = name
        this.age = age
    }

    fun display(){
        print("Your name is $name, ")
        println("you have $age years old.")
    }
}
