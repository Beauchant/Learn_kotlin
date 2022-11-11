fun main(){
    val names: Array<String> = arrayOf("Boby", "Georges", "Fanita", "Fanfan")
    val obj: Array<Any> = arrayOf("Boby", "Georges", "Fanita", "Fanfan", 8)
    val items = arrayOf(3, 5, 6, "Bob", true, 3.5)

    println(names[0])
    print("Enter name: ")
    names[0] = readLine().toString()
    println("--------------------")
    names.forEach { println(it) }
    println("--------------------")

    for(index in items.indices){
        println("Item $index -> ${items[index]}")
    }
    println("--------------------")

    for((index, value) in arrayOf("Pierre", 2, 4, "Nadine", "Jean", ).withIndex()){
        println("Item $index -> $value")
    }
    println("--------------------")

    for(i in 0..items.lastIndex){
        println(items[i])
    }
    println("--------------------")
//    for (element in items){
////        if(element::class.java.typeName == "java.lang.Integer"){
////            println(element)
////        }
//
//        if(element is Boolean){
//            println(element)
//        }
//    }
//    println("--------------------")
//    arrayOf(3, 5, 6, "Bob", true, 3.5).forEach { print(" $it ") }
//    println("\n--------------------")

    val notes = arrayOf(56, 78, 97, 76, 84)
    println("The max note is: ${findMax(notes)}")
    println("The min note is: ${findMin(notes)}")
}

// A function to find max value of an array
fun findMax(numbers: Array<Int>): Int{
    var max = numbers[0]

    for(number in numbers){
        if(number > max){
            max = number
        }
    }
    return max
}

// A function to find min value of an array
fun findMin(numbers: Array<Int>): Int{
    var min = numbers[0]

    for(number in numbers){
        if(number < min){
            min = number
        }
    }
    return min
}
