class Person constructor(_name: String, _age: Int) {
    var name: String
    var age: Int

    init {
        name = _name
        age = _age
    }

    fun display(){
        print("Your name is $name, ")
        println("you have $age years old.")
    }
}
