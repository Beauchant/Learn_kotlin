import java.util.Scanner
fun main(){
    // Facture
    val input = Scanner(System.`in`)

    val articles = mapOf("Pizza" to 250,
        "Cake" to 350, "Popcorn" to 50,
        "Fries" to 150, "Chips" to 50,
        "Soda" to 25, "Lemonade" to 25)

    var sum = 0
    var order = ""
    //var missing: String = ""
    while (true){
        print("Enter an article (q to exit): ")
        val article = input.nextLine().capitalize()
        if(article == "Q"){
            break
        }
        else if(articles[article] != null){
            sum += articles[article]!!.toInt()
            order = "$order $article"
        }
    }

    println("\n-----------------------------")
    println("Your orders are:$order")
    println("The Total is: $$sum")
    println("-----------------------------")
}
