fun main() {

    val a = IntArray(5)

    println("Enter the numbers:")

    for (i in 0 until a.size) {
        print("a[$i] = ")
        a[i] = readLine()!!.toInt()
    }

    val max = a.maxOrNull()

    println("Largest Element = $max")
}