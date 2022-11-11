fun main(){
    // Take input from the user
    print("Enter your name: ")
    val name = readLine().toString()
    print("Enter your age: ")
    val age = readLine()

    println("Your name is: $name and you have $age years old.\n")
    println("----------------")

    // Get a part of a string
    println(name.substring(0, 5))
    println("----------------")

    // Check if a string contains something
    println(name.contains("no"))
    // We can use true to skip case-sensitive
    println(name.contains("no", true))
    println("No" in name)
    println("----------------")

    // Get the length of a string
    println("the length of name is: ${name.length} character")
    println("----------------")

    // Compare two strings
    val str1 = "Bonjour"
    val str2 = "Bonsoir"

    println("$str1 = $str2: ${str1 == str2}")
    println("----------------")

    // Get a character of a string by using it index
    println("The second character of name is: ${name[1]}")
}
