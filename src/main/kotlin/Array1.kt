fun main(){
    // Numeric arrays type
    val arr1 = byteArrayOf(34, 65, 7)
    val arr2 = shortArrayOf(3, 5, 6, 7)
    val arr3 = intArrayOf(3, 4, 6, 7)
    val arr4 = floatArrayOf(2.5f, 7.8f, 9.4f)
    val arr5 = doubleArrayOf(34.14, 62.74)
    val arr6 = longArrayOf(2334, 5656678899800, 96363787969)

    val arrInt: Array<Int> = arrayOf(2, 4, 5, 4, 5, 6, 2, 7, 1)

    // Remove duplicate values from arrInt
    val unique = arrInt.distinct()
    for((index, value) in unique.withIndex()){
        println("$index -> $value")
    }

    // Get the size of the array (using size or count method)
    println("The size of the array is: ${arrInt.size}")
    println("The size of the array is: ${arrInt.count()}")

    // Get the first element of the array
    println("The first element is: ${arrInt[0]}")
    println("The first element is: ${arrInt.first()}")

    // Get the last element of the array
    println("The last element is: ${arrInt.last()}")

    // Check if the array is empty or not
    println("Array is empty: ${arrInt.isEmpty()}")
    println("Array is not empty: ${arrInt.isNotEmpty()}")

    val drop1 = arr1.drop(1)
    val drop2 = arr1.dropLast(1)
    println(drop1)
    println(drop2)
    print("The elements of arr1 are still: ")
    arr1.forEach { print("$it ") }
}
