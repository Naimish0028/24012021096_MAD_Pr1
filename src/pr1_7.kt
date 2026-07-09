fun factorial(n: Int): Int {

    if (n == 0 || n == 1)
        return 1

    return n * factorial(n - 1)
}

fun main() {
    print("Enter Number: ")
    val n = readLine()!!.toInt()

    println("Factorial = ${factorial(n)}")
}