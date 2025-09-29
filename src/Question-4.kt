import java.util.Scanner
fun main()
{
    var scanner = Scanner(System.`in`)
    print("Enter Number : ")
    var num = scanner.nextInt()

    if (num % 2 == 0)
    {
        println("$num is even")
    }
    else
    {
        println("$num is odd")
    }
}