import java.util.Scanner
fun main(){
    val input = Scanner(System.`in`)

    print("Enter your name: ")
    val name = input.nextLine()
    print("Input number1: ")
    val number1 = input.nextInt()
    print("Input number2: ")
    val number2 = input.nextInt()

    println("\nHello $name")
    Add2Numbers(number1, number2)
    println("---------------------")
    Add2Numbers(4.5, 5)
    println("---------------------")
    Add2Numbers(7, 2.5)
    println("---------------------")
    Add2Numbers(4.3, 6.8)
}

fun Add2Numbers(number1: Int, number2: Int) {
    println("$number1 + $number2 = ${number1 + number2}")
}

fun Add2Numbers(number1: Double, number2: Double) {
    println("$number1 + $number2 = ${number1 + number2}")
}

fun Add2Numbers(number1: Double, number2: Int) {
    println("$number1 + $number2 = ${number1 + number2}")
}

fun Add2Numbers(number1: Int, number2: Double) {
    println("$number1 + $number2 = ${number1 + number2}")
}