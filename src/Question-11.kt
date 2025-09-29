class Matrix(val data: Array<IntArray>, val rows: Int, val cols: Int)
{
    operator fun plus(other: Matrix): Matrix
    {
        require(rows == other.rows && cols == other.cols)
        val result = Array(rows) { IntArray(cols) }
        for (i in 0 until rows)
        {
            for (j in 0 until cols)
            {
                result[i][j] = data[i][j] + other.data[i][j]
            }
        }
        return Matrix(result, rows, cols)
    }

    operator fun minus(other: Matrix): Matrix
    {
        require(rows == other.rows && cols == other.cols)
        val result = Array(rows) { IntArray(cols) }
        for (i in 0 until rows)
        {
            for (j in 0 until cols)
            {
                result[i][j] = data[i][j] - other.data[i][j]
            }
        }
        return Matrix(result, rows, cols)
    }

    operator fun times(other: Matrix): Matrix
    {
        require(cols == other.rows)
        val result= Array(rows) { IntArray(other.cols) }
        for (i in 0 until rows)
        {
            for (j in 0 until other.cols)
            {
                for(k in 0 until cols)
                {
                    result[i][j] += data[i][k] * other.data[k][j]
                }
            }
        }
        return Matrix(result, rows, other.cols)
    }

    override fun toString(): String {
        val builder = StringBuilder()
        builder.append("($rows x $cols) Matrix:\n")
        for (row in data) {
            builder.append("")
            builder.append(row.joinToString("  "))
            builder.append("\n")
        }
        return builder.toString()
    }
}

fun main()
{
    val firstMatrix = Matrix(arrayOf(intArrayOf(3, -2, 5), intArrayOf(3, 0, 4)),2, 3)
    val secondMatrix = Matrix(arrayOf(intArrayOf(2, 3), intArrayOf(-9, 0), intArrayOf(0, 4)), 3, 2)
    val secondMatrix1 = Matrix(arrayOf(intArrayOf(6, 3), intArrayOf(9, 0), intArrayOf(5, 4)), 3, 2)

    println("***************Addition***************")
    print("Matrix:1 ")
    print(secondMatrix1)
    print("Matrix:2 ")
    print(secondMatrix)
    val thirdMatrix = secondMatrix1 + secondMatrix
    println("Addition : $thirdMatrix")

    println("***************Subtraction***************")
    print("Matrix:1 ")
    print(secondMatrix1)
    print("Matrix:2 ")
    print(secondMatrix)
    val subtractMatrix = secondMatrix1 - secondMatrix
    println("Subtraction : $subtractMatrix")

    println("***************Multiplication***************")
    print("Matrix:1 ")
    print(firstMatrix)
    print("Matrix:2 ")
    print(secondMatrix)
    val multiplication = firstMatrix * secondMatrix
    println("Multiplication : $multiplication")
}