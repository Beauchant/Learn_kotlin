fun main(){
    // Take input from the user
//    print("Enter your name: ")
//    val name = readLine()
//    print("Enter your age: ")
//    val age = readLine()
//
//    println("Your name is: $name and you have $age years old.\n")

    print("Enter the number 1: ")
    //val number1 = Integer.valueOf(readLine())
    val number1 = readLine()!!.toInt()
    //val number1 = readLine()?.toInt()
    print("Enter the number 2: ")
    val number2 = Integer.valueOf(readLine())

    println("Number1 + Number2 = ${number1 + number2}")
}
