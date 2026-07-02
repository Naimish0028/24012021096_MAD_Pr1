fun main() {
    print("Enter the number 1: ")
    val num1 = readln().toInt()
    print("Enter the number 2: ")
    val num2 = readln().toInt()
    println(addition(num1, num2))
    println(substraction(num1, num2))
    println(multiplication(num1, num2))
    println(division(num1, num2))
}
fun addition(num1:Int , num2:Int): Int{
    return num1+num2
}
fun substraction(num1:Int, num2:Int):Int{
    return num1-num2
}
fun multiplication(num1:Int, num2:Int):Int{
    return num1*num2
}
fun division(num1:Int, num2:Int):Int{
    return num1/num2
}
