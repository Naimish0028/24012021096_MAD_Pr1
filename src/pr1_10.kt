open class Car(var model : String) {

    var price: Long = 20000000L

    constructor(p : Long, m : String): this(m){
        price = p
    }

}
class Suzuki(m : String) : Car(m) {

}
fun main(){
    var m1 = Suzuki("Access")
    val a1 = Car( "BMW M5")
    print("Here is the ${a1.model}")
    println(" In ${a1.price}")
}