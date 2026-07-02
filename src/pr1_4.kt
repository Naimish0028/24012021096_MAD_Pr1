fun main(){
    print("Enter the number: ")
    val num = readln().toInt()
    println(
        if (num % 2 == 0)
        "Even"
        else
        "Odd"
    )
}