fun main(){
    var sum = 0

    while(true){
        print("Enter a number: ")
        val input = readLine()!!.toInt()
        if(input == 0){
            break
        }
        else{
            sum += input
        }
    }
    println("The sum of your numbers is: $sum")
}
