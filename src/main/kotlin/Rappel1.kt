fun main(){
    print("Enter your firstname: ")
    val firstname = readLine()
    print("Enter your lastname: ")
    val lastname = readLine()
    print("Enter your age: ")
    val age = readLine()?.toInt()

    println("My firstname name is: ${firstname?.capitalize()}")
    println("My lastname name is: ${lastname?.capitalize()}")
    println("I have $age years old.")
}
