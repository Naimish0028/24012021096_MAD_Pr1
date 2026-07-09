fun main(){
    val a1 = arrayOf('A','B','C')
    println(a1.joinToString())
    val a2 = Array<Int>(5){0}
    println(a2.joinToString())
    val a3 = Array<Int>(5){i-> i*i}
    println(a3.joinToString())

    val a4 = IntArray(4)
    println(a4.joinToString())

    val a5 = arrayOf<Int>(12,10,1,5,18,19)
    println(a5.joinToString())

    val a6 = arrayOf(arrayOf(1,2,3),arrayOf(3,4,5),arrayOf(5,6,7,))
    println(a6.contentDeepToString())

     val a7 = IntArray(5)
    println("Enter elements in array: ")
    for (i in 0..4){
        print("a[$i]=")
        a7[i] = readLine()!!.toInt()
    }
    println("Your entered elements in array are : ")
    println(a7.contentToString())


    val a8 = intArrayOf(56, 23, 49, 12, 2)

    println("*************With Built-in Function*************")
    a8.sort()
    println("After sorting by built-in function:")
    println(a8.joinToString())

println("*************Without Built-in Function*************")
    println("Before Sorting")
    println("56,23,49,12,2")

    println("After Sorting without built-in function:")

        val a = intArrayOf(56, 23, 49, 12, 2)

        println("Before Sorting:")
        println(a.joinToString())

        for (i in 0 until a.size - 1) {
            for (j in 0 until a.size - i - 1) {

                if (a[j] > a[j + 1]) {

                    val temp = a[j]
                    a[j] = a[j + 1]
                    a[j + 1] = temp
                }
            }
        }

        println("After Sorting:")
        println(a.joinToString())
    }





