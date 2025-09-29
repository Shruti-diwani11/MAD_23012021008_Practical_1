fun main()
{
    var a: Int=10
    println("Integer Value = $a")
    var b: Double = a.toDouble()
    println("Double Value (From Integer) = $b")
    var c: String = "10"
    println("String Value = $c")
    var d: Int = c.toInt()
    println("Integer Value (From String) = $d")
    var e: Double = a.toDouble()
    println("Double Value (From String) = $e")
}