fun main(){
    val listOfList = listOf(listOf(2, 4, 1), listOf(5, 3, 7), listOf(1, 0, 8))
    listOfList.forEach{ println(it) }

    var index = 0
    for(i in listOfList){
        for(j in i){
            print("$j ")
        }
        println()
    }
    println("----------------")

    // The flatten function is used to convert two dimensions array to one dimension
    val flattenNumber = listOfList.flatten()
    println(flattenNumber)
    println(flattenNumber::class.java.typeName)
    for(i in flattenNumber.indices){
        println("$i -> ${flattenNumber[i]}")
        if((i + 1) % 3 == 0){
            println()
        }
    }
}
