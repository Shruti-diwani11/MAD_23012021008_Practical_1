import java.util.Scanner
fun factorial(num: Int): Int{
    if (num == 0 || num == 1)
        return 1
    else
        return num * factorial(num - 1)
}

fun TailRecFactorial(n: Int, accum: Int = 1): Int {
    val soFar = n * accum
    return if (n <= 1) {
        soFar
    } else {
        TailRecFactorial(n - 1, soFar)
    }
}

fun main()
{
    var scanner = Scanner(System.`in`)
    print("Enter Number : ")
    var num = scanner.nextInt()

    var fact = factorial(num)
    println("Factorial of $num = $fact")

    var tailRec = TailRecFactorial(num)
    println("By TailRec keyword, Factorial of $num = $tailRec")
}