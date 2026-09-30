//Operator Overloading and Matrix Operations
class Matrix(
    private val data: Array<IntArray>
) {

    private val rows = data.size
    private val cols = data[0].size

    operator fun plus(other: Matrix): Matrix {
        require(rows == other.rows && cols == other.cols) {
            "Matrix dimensions must be the same"
        }

        val result = Array(rows) { IntArray(cols) }

        for (i in 0 until rows) {
            for (j in 0 until cols) {
                result[i][j] = data[i][j] + other.data[i][j]
            }
        }

        return Matrix(result)
    }

    operator fun minus(other: Matrix): Matrix {
        require(rows == other.rows && cols == other.cols) {
            "Matrix dimensions must be the same"
        }

        val result = Array(rows) { IntArray(cols) }

        for (i in 0 until rows) {
            for (j in 0 until cols) {
                result[i][j] = data[i][j] - other.data[i][j]
            }
        }

        return Matrix(result)
    }

    operator fun times(other: Matrix): Matrix {
        require(cols == other.rows) {
            "Invalid matrix dimensions for multiplication"
        }

        val result = Array(rows) { IntArray(other.cols) }

        for (i in 0 until rows) {
            for (j in 0 until other.cols) {
                for (k in 0 until cols) {
                    result[i][j] += data[i][k] * other.data[k][j]
                }
            }
        }

        return Matrix(result)
    }

    override fun toString(): String {
        return data.joinToString("\n") {
            it.joinToString(" ")
        }
    }
}

fun main() {

    val matrix1 = Matrix(
        arrayOf(
            intArrayOf(1, 2),
            intArrayOf(3, 4)
        )
    )

    val matrix2 = Matrix(
        arrayOf(
            intArrayOf(5, 6),
            intArrayOf(7, 8)
        )
    )

    println("Matrix 1:")
    println(matrix1)

    println("\nMatrix 2:")
    println(matrix2)

    println("\nMatrix Addition:")
    println(matrix1 + matrix2)

    println("\nMatrix Subtraction:")
    println(matrix1 - matrix2)

    println("\nMatrix Multiplication:")
    println(matrix1 * matrix2)
}