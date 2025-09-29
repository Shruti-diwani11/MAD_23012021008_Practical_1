fun addition(num1: Int, num2: Int, num3: Int): Int{
    var result = num1 + num2 + num3
    return result
}

fun subtraction(num1: Int, num2: Int, num3: Int): Int{
    var result = num1 - num2 - num3
    return result
}

fun multiplication(num1: Int, num2: Int, num3: Int): Int{
    var result = num1 * num2 * num3
    return result
}

fun division(num1: Int, num2: Int): Int{
    var result = num1 / num2
    return result
}

fun main()
{
    var sum = addition(111, 2222, -222)
    println("Addition of 111, 2222, -222 is $sum")
    var sub = subtraction(111, 2222, -222)
    println("Subtraction of 111, 2222, -222 is $sub")
    var mul = multiplication(111, 2222, -222)
    println("Multiplication of 111, 2222, -222 is $mul")
    var div = division(2222, 111)
    println("Division of 2222, 111 is $div")
}

