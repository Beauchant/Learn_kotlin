class Person2(var name: String, var age: Int){ // Constructeur principal

    // Constructeur secondaire
    var email: String? = null
    var surname: String? = null
        get() = field?.capitalize()
        set(value) {field = "$value"}

    constructor(name: String, age: Int, email: String): this(name, age){
        this.email = email
    }

    // Constructeur secondaire
    constructor(name: String, surname: String, age: Int): this(name, age){
        this.surname = surname
    }

    fun display(){
        print("Your name is $name, ")
        println("you have $age years old.")
        if(email != null){
            println("Your email is: $email")
        }
        else if(surname != null){
            println("Your surname is: $surname")
        }
    }
}
