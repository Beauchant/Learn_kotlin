fun main(){
    var day = "Wednesday"

    when (day){
        "Monday", "Tuesday", "Wednesday" -> println("Today is: $day")
        "Thursday" -> println("Today is: $day")
        "Friday" -> println("Today is: $day")
        "Saturday" -> println("Today is: $day")
        "Sunday" -> println("Today is: $day")
        else -> println("$day is not a day")
    }

    println("--------------")

    val day1 = 6
    var result = when(day1){
        in 1.rangeTo(5)-> "Week"
        6, 7 -> "Week-end"
        else -> "Wrong!"
    }
    println(result)
}
