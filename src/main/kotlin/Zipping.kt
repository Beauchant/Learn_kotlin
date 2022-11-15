fun main(){
    val courses = listOf("Math", "Java", "Kotlin", "hTML")
    val notes = listOf(76, 89, 79, 95)

    // Two ways to use zip function and got the same result
    val zip1 = courses.zip(notes)  // 1
    val zip2 = courses zip notes   // 2

    println(zip2)
    println(zip1[0])
    println(zip1[0]::class.java.typeName)
    println(zip1::class.java.typeName)
    println("----------------")

    for(i in zip1){
        if(i is kotlin.Pair){
            print("$i ")
        }
    }
    println("\n----------------")

    println(courses.zip(notes){course, note -> "${course.replaceFirstChar{it.uppercase()}} -> $note"})
}
