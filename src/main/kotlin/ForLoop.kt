fun main(){
    // for loop

    // First way
    for(i in 1 until 5){
        println(i)
    }
    println("---------------")

    // Second way
    for(i in 1 until 10 step 2){
        println(i)
    }
    println("---------------")

    // Third way
    var sum = 0
    for(i in 1..5){
        sum += i
    }
    println("The sum is $sum")
    println("---------------")

    
}