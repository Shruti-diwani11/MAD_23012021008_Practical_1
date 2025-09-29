fun main()
{
    print("Enter Month Number : ")
    var monthNum = readln().toInt()

    val Month = when (monthNum)
    {
        1 -> "January"
        2 -> "February"
        3 -> "March"
        4 -> "April"
        5 -> "May"
        6 -> "June"
        7 -> "July"
        8 -> "August"
        9 -> "September"
        10 -> "October"
        11 -> "November"
        12 -> "December"
        else -> "Please enter valid input."
    }
    print("$Month")
}