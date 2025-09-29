fun main()
{
    val array = IntArray(5)
    println("Enter the 5 numbers : ")
    for(i in array.indices)
    {
        print("a[$i]=")
        array[i] = readln().toInt()
    }
    var largeNum = array[0]

    for (num in array)
        if (largeNum < num)
            largeNum = num

    println("Largest Number : $largeNum")
}