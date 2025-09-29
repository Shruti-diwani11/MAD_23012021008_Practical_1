fun main()
{
    var a: Int = 10
    var b: Int = 20
    println("With using Third Variable:")
    println("Before swapping:" )
    println("The value of a is $a and Value of b is $b")

    var temp = a
    a = b
    b = temp

    println("After swapping:")
    println("The value of a is $a and Value of b is $b")

    println("********************")

    var a1: Int = 10
    var b1: Int = 20
    println("Without using Third Variable:")
    println("Before swapping:")
    println("The value of a is $a1 and Value of b is $b1")

    a1 = a1 + b1
    b1 = a1 - b1
    a1 = a1 - b1

    println("After swapping:")
    println("The value of a is $a1 and Value of b is $b1")
}