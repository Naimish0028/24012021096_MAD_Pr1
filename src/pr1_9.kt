//Find Maximum Number from ArrayList:
fun main() {

    val a = ArrayList<Int>()

    println("Enter 5 numbers:")

    for (i in 0 until 5) {
        print("a[$i] = ")
        a.add(readln().toInt())
    }

    val max = a.maxOrNull()

    println("Largest Element = $max")
}