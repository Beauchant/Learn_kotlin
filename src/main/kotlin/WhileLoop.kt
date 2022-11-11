fun main() {
// while loop
    var index = 0
    while (true) {
        index += 1
        if (index == 10) {
            break
        }
    }
    println(index)
    println("---------------")

    WhileF()
}

fun WhileF(){
    var n = 0
    while(n++ < 10){
        println("Indice $n")
    }
}