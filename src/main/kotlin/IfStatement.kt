fun main(){
    val isActive = true
    if(!isActive){
        println("The user is active")
    }
    else{
        println("The user is not active")
    }

    val age = 18
    val result = if(age <= 18) "You have no access!" else 0
    println(result)

    if(isActive) println("The user is active") else print(0)
}