fun main(){
    val result = Calculator.sum(4, 5)
    println(result)
}

class Calculator(){
    // companion object allows you to have field or function in your class that you can use
    // without creating an object of your class

    companion object{
        fun sum(a: Int, b: Int): Int{
            return a + b
        }
    }
}
