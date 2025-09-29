fun main()
{
    val array1 = arrayOf(10, 90, 60, 80, 100)
    println("Array-1 by using arrayOf() method:")
    println(array1.joinToString())

    val array2 = Array<Int>(5) { 0 }
    println("Array-2 by using Array<>():")
    println(array2.joinToString())

    val array3 = Array<Int>(8) {it}
    println("Array-3 by using Array<>() and lambda function:")
    println(array3.joinToString())

    val array4 = IntArray(5)
    println("Array-4 by using IntArray():")
    println(array4.joinToString())
    println()

    val array5 = intArrayOf(12, 10, 1, 5, 18, 19)
    println("Array-5 by using intArrayOf():")
    println(array5.joinToString())
    println()

    val array6 = arrayOf(intArrayOf(1, 3), intArrayOf(4, 5), intArrayOf(6, 7))
    println("2D Array-6 by using arrayOf() and intArrayOf():")
    println(array6.contentDeepToString())

    val array = IntArray(5)
    println("Please enter Array Value:")
    for(i in array.indices)
    {
        print("a[$i]=")
        array[i] = readln().toInt()
    }
    println("Entered Array:")
    println(array.toList())

    println("***************With Built-in Function***************")
    println("After sorting by built-in function:")
    val intArray1 = intArrayOf(56, 23, 49, 12, 2)
    val sortedArray = intArray1.sortedArray()
    println(sortedArray.joinToString())
    println()

    println("***************Without Built-in Function***************")
    println("Before Sorting:")
    val intArray2 = intArrayOf(56, 23, 49, 12, 2)
    println(intArray2.joinToString())
    val n = intArray2.size

    for (i in 0 until n) {
        for (j in 0 until n - i - 1) {
            if (intArray2[j] > intArray2[j + 1]) {
                val temp = intArray2[j]
                intArray2[j] = intArray2[j + 1]
                intArray2[j + 1] = temp
            }
        }
    }
    println()
    println("After Sorting without built-in function:")
    for (element in intArray2)
    {
        print("$element ")
    }
}