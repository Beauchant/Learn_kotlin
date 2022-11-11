fun main(){
    val somme = {x: Int, y: Int -> x + y}
    val soustraction = { x: Int, y: Int -> x - y}
    val product = {x: Int, y: Int -> x + y}
    val division = {x: Double, y: Double -> x / y}

    println(somme(3, 5))
    println(soustraction(3, 5))
    println(product(3, 5))
    println(division(3.4, 5.7))
}