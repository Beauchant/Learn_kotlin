fun main(){
    sayHello("Alex")
    sayHello("Beauchant")
    println("-----------------")

    var name = "Martha"
    var age = 34

    showInfo(name, age)
    println("-----------------")

    var a = 4
    var b = 5
    var result = Add(a, b)
    println(result)
    println("-----------------")

    display(2, 4, 5, 7)
    println("-----------------")

    display("Pierre", "Martha", "Bob", "Fanfan")
    println("-----------------")

    val x = 6
    val y = 9
    println("La somme de $x + $y est: ${Somme(x, y)}")
}

fun sayHello(name: String){
    println("Hello, $name")
}

fun showInfo(name: String, age: Int){
    println("My name is $name.")
    println("I have $age years old.")
}

fun Add(a: Int, b: Int = 5): String{
    return "The sum of $a + $b is ${a + b}"
}

fun Add(a: Double, b: Int): String{
    return "The sum of $a + $b is ${a + b}"
}

fun display(vararg number: Int){
    for (i in number){
        println(i)
    }
}

fun display(vararg name: String){
    name.forEach { println(it.uppercase()) }
}

fun Somme(x: Int, y: Int) = x + y