fun main(){
    print("Enter the number: ")
    val num = readln().toInt()

    println(
        when (num){
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
            else -> "Please enter proper number."
        }
    )
}